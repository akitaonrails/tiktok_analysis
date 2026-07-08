package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451370Hmx {
    public final int LIZ;
    public int LIZIZ;
    public final ArrayList<List<PromptModel>> LIZJ;
    public final ArrayList<PromptModel> LIZLLL;

    public C451370Hmx() {
        this(0);
    }

    public final List<PromptModel> LIZ() {
        int i;
        return (this.LIZJ.isEmpty() || (i = this.LIZIZ) < 0) ? C13BV.INSTANCE : (List) ListProtector.get(this.LIZJ, i);
    }

    public final PromptModel LIZIZ() {
        PromptModel promptModel = (PromptModel) C13LP.LJLJJL(this.LIZLLL, AbstractC19994813Le.Default);
        return promptModel == null ? C0MD9.LIZ("", null, false, 30) : promptModel;
    }

    public final List<PromptModel> LIZJ() {
        if (this.LIZJ.isEmpty()) {
            return C13BV.INSTANCE;
        }
        if (this.LIZIZ == this.LIZJ.size() - 1) {
            LIZLLL(C1697820uHc.LIZLLL(this.LIZLLL));
        }
        int i = this.LIZIZ;
        int size = i < 0 ? 0 : (i + 1) % this.LIZJ.size();
        this.LIZIZ = size;
        return (List) ListProtector.get(this.LIZJ, size);
    }

    public C451370Hmx(int i) {
        this.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 10, "studio_story_ai_live_photo_prompt_page_count", true);
        this.LIZIZ = -1;
        this.LIZJ = new ArrayList<>();
        this.LIZLLL = new ArrayList<>();
    }

    public final void LIZLLL(List<PromptModel> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (PromptModel promptModel : list) {
            if (hashSet.add(promptModel.prompt)) {
                arrayList.add(promptModel);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.LIZIZ = -1;
        this.LIZLLL.clear();
        this.LIZLLL.addAll(arrayList);
        this.LIZJ.clear();
        int i = 0;
        while (i < arrayList.size()) {
            int iMin = Math.min(this.LIZ + i, arrayList.size());
            final ArrayList arrayList2 = new ArrayList(arrayList.subList(i, iMin));
            if (arrayList2.size() < this.LIZ && arrayList.size() > this.LIZ) {
                ArrayList arrayList3 = new ArrayList(this.LIZLLL);
                arrayList3.removeIf(new Predicate() { // from class: X.0Hmw
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        PromptModel promptModel2 = (PromptModel) obj;
                        Iterator<PromptModel> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().prompt, promptModel2.prompt)) {
                                return true;
                            }
                        }
                        return false;
                    }
                });
                while (arrayList2.size() < this.LIZ) {
                    Object objLJLJJL = C13LP.LJLJJL(arrayList3, AbstractC19994813Le.Default);
                    if (objLJLJJL == null) {
                        return;
                    }
                    arrayList2.add(objLJLJJL);
                    arrayList3.remove(objLJLJJL);
                }
            }
            this.LIZJ.add(arrayList2);
            i = iMin;
        }
    }
}
