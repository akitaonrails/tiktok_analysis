package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766240U3y extends AbstractC21342018fa {
    public final List<LiveEffect> LIZ;
    public final List<LiveEffect> LIZIZ;
    public final String LIZJ;

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

    public /* synthetic */ C766240U3y(List list, List list2) {
        this(list, list2, "");
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LIZ, i);
        LiveEffect liveEffect2 = (LiveEffect) ListProtector.get(this.LIZIZ, i2);
        if (i != i2) {
            return false;
        }
        C767630U9h c767630U9h = C767630U9h.LL;
        if (C500260Jjc.LJJJI(Boolean.valueOf(C767630U9h.LJI(this.LIZJ).contains(liveEffect2))) || !Intrinsics.LJFF(liveEffect.getName(), liveEffect2.getName())) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        return Intrinsics.LJFF(((LiveEffect) ListProtector.get(this.LIZ, i)).getResourceId(), ((LiveEffect) ListProtector.get(this.LIZIZ, i2)).getResourceId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C766240U3y(List<? extends LiveEffect> list, List<? extends LiveEffect> list2, String str) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = str;
    }
}
