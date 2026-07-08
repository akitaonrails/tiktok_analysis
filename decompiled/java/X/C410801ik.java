package X;

import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.viewholder.AIContentExploreAISelfViewHolder$updateProfileImage$1$1", f = "AIContentExploreAISelfViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C410801ik extends C09AX implements InterfaceC1631620sYq<Boolean, Bitmap, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Bitmap>>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ Object LLILLJJLI;

    public C410801ik(InterfaceC1364105Vn<? super C410801ik> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIContentExploreAISelfViewHolder@2972.updateProfileImage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        Pair pair = new Pair(Boolean.valueOf(z), this.LLILLJJLI);
        C1C7U.LIZIZ("AIContentExploreAISelfViewHolder@2972.updateProfileImage$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Bitmap bitmap, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends Bitmap>> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C410801ik c410801ik = new C410801ik(interfaceC1364105Vn);
        c410801ik.LL = zBooleanValue;
        c410801ik.LLILLJJLI = bitmap;
        return c410801ik.invokeSuspend(Unit.LIZ);
    }
}
