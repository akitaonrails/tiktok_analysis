package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U5Y, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U5Y extends AbstractC21342018fa {
    public final List<LiveEffect> LIZ;
    public final List<LiveEffect> LIZIZ;

    @Override // X.AbstractC21342018fa
    public final Object LIZJ(int i, int i2) {
        return null;
    }

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return this.LIZ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0U5Y(List<? extends LiveEffect> list, List<? extends LiveEffect> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LIZ, i);
        LiveEffect liveEffect2 = (LiveEffect) ListProtector.get(this.LIZIZ, i2);
        if (liveEffect.LJJJZ().size() != liveEffect2.LJJJZ().size()) {
            return false;
        }
        ArrayList<Pair> arrayList = (ArrayList) C13LP.LLIILII(liveEffect.LJJJZ(), liveEffect2.LJJJZ());
        if (!arrayList.isEmpty()) {
            for (Pair pair : arrayList) {
                if (!Intrinsics.LJFF(((LiveEffect.ComposerConfig) pair.getFirst()).tag, ((LiveEffect.ComposerConfig) pair.getSecond()).tag) || ((LiveEffect.ComposerConfig) pair.getFirst()).defaultValue != ((LiveEffect.ComposerConfig) pair.getSecond()).defaultValue || ((LiveEffect.ComposerConfig) pair.getFirst()).doubleDirection != ((LiveEffect.ComposerConfig) pair.getSecond()).doubleDirection || ((LiveEffect.ComposerConfig) pair.getFirst()).maxValue != ((LiveEffect.ComposerConfig) pair.getFirst()).maxValue) {
                    return false;
                }
            }
        }
        if (!Intrinsics.LJFF(liveEffect.getName(), liveEffect2.getName())) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        return Intrinsics.LJFF(((LiveEffect) ListProtector.get(this.LIZ, i)).getResourceId(), ((LiveEffect) ListProtector.get(this.LIZIZ, i2)).getResourceId());
    }
}
