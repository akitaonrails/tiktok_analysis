package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C641550PEj implements C0P74, InterfaceC588620N6u {
    public final RecyclerView LLILLJJLI;
    public InterfaceC648130PbX LLILZ;
    public final /* synthetic */ C640720PBe LL = new C640720PBe();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(471));

    @Override // X.InterfaceC588620N6u
    public final MutableLiveData<Integer> LIZ() {
        return (MutableLiveData) this.LLILLL.getValue();
    }

    @Override // X.C0P74
    public final void LJL() {
        this.LL.LL = null;
    }

    @Override // X.InterfaceC588620N6u
    public final String getTag() {
        return C641550PEj.class.getSimpleName();
    }

    @Override // X.InterfaceC588620N6u
    public final boolean isEnable() {
        return C588630N6v.LIZ(this);
    }

    public C641550PEj(RecyclerView recyclerView) {
        this.LLILLJJLI = recyclerView;
    }

    @Override // X.C0P74
    public final void z1(C588600N6s c588600N6s) {
        this.LL.LL = c588600N6s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    public final void LIZIZ(String str, boolean z) {
        ?? arrayList;
        Object next;
        String aid;
        this.LL.LIZIZ();
        RecyclerView recyclerView = this.LLILLJJLI;
        InterfaceC648130PbX interfaceC648130PbX = null;
        if (recyclerView == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            List<Integer> listLIZ = C641510PEf.LIZ(recyclerView);
            if (listLIZ.isEmpty()) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList();
                Iterator<Integer> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(it2.next().intValue());
                    if ((viewHolderFindViewHolderForAdapterPosition instanceof InterfaceC648130PbX) && viewHolderFindViewHolderForAdapterPosition != null) {
                        arrayList.add(viewHolderFindViewHolderForAdapterPosition);
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                Aweme awemeLJIIIIZZ = ((InterfaceC648130PbX) next).LJJZZI().LJIIIIZZ();
                if (awemeLJIIIIZZ != null) {
                    aid = awemeLJIIIIZZ.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(str, aid)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC648130PbX interfaceC648130PbX2 = (InterfaceC648130PbX) next;
        if (interfaceC648130PbX2 != null || ((!arrayList.isEmpty()) && z && (interfaceC648130PbX2 = (InterfaceC648130PbX) ListProtector.get(arrayList, 0)) != null)) {
            interfaceC648130PbX = interfaceC648130PbX2;
        }
        this.LLILZ = interfaceC648130PbX;
        ((LiveData) this.LLILLL.getValue()).setValue(1);
        InterfaceC648130PbX interfaceC648130PbX3 = this.LLILZ;
        if (interfaceC648130PbX3 != null) {
            this.LL.LIZLLL(interfaceC648130PbX3);
        }
    }
}
