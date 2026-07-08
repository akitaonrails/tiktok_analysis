package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.SocialAvatarIdDisplayStrategy$1$1", f = "SocialAvatarIdDisplayStrategy.kt", l = {142, 146, 150, 155, 193, 200, 206, 209, 217}, m = "invokeSuspend")
public final class C441040HRe extends C09AX implements Function2<C0HOM<? extends List<? extends C440440HOw>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C441030HRd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441040HRe(C441030HRd c441030HRd, InterfaceC1364105Vn<? super C441040HRe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c441030HRd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C441040HRe c441040HRe = new C441040HRe(this.LLILLL, interfaceC1364105Vn);
        c441040HRe.LLILLJJLI = obj;
        return c441040HRe;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0228 A[LOOP:0: B:60:0x0214->B:65:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0277  */
    /* JADX WARN: Type inference failed for: r8v10, types: [T, kotlin.jvm.internal.AwS104S0400000_6] */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, kotlin.jvm.internal.AwS104S0400000_6] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C441040HRe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0HOM<? extends List<? extends C440440HOw>> c0hom, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0hom, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
