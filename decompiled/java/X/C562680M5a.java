package X;

import androidx.activity.ComponentActivity;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562680M5a extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;
    public final /* synthetic */ C0M8Q LLILLJJLI;
    public final /* synthetic */ ComponentActivity LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ EnterStoryParam LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ Boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C562680M5a(SocialMediaPickerViewModel socialMediaPickerViewModel, C0M8Q c0m8q, ComponentActivity componentActivity, Long l, EnterStoryParam enterStoryParam, Long l2, Boolean bool) {
        super(2);
        this.LL = socialMediaPickerViewModel;
        this.LLILLJJLI = c0m8q;
        this.LLILLL = componentActivity;
        this.LLILZ = l;
        this.LLILZIL = enterStoryParam;
        this.LLILZLL = l2;
        this.LLIZ = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC1680500tpg r12, java.lang.Integer r13) {
        /*
            r11 = this;
            X.0tpg r12 = (X.InterfaceC1680500tpg) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r0 = r13.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L19
            boolean r0 = r12.LIZ()
            if (r0 == 0) goto L19
            r12.LIZJ()
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L19:
            com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel r3 = r11.LL
            X.0M8Q r4 = r11.LLILLJJLI
            java.lang.Long r2 = r11.LLILZ
            com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam r0 = r11.LLILZIL
            java.lang.Long r7 = r11.LLILZLL
            java.lang.Boolean r1 = r11.LLIZ
            r3.LLJ = r4
            if (r2 == 0) goto L47
            long r8 = r2.longValue()
            X.0LJI r4 = new X.0LJI
            java.lang.String r5 = r0.getShootWay()
            java.lang.String r6 = r0.getEnterFrom()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r10 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r4.<init>(r5, r6, r7, r8, r10)
            com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine r0 = r3.LLILZIL
            r0.pB(r4)
            r3.LLJJL = r4
        L47:
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r12.LJJIIJZLJL(r0)
            X.0M8Q r0 = r11.LLILLJJLI
            boolean r5 = r12.LJII(r0)
            androidx.activity.ComponentActivity r0 = r11.LLILLL
            boolean r0 = r12.LJII(r0)
            r5 = r5 | r0
            X.0M8Q r4 = r11.LLILLJJLI
            androidx.activity.ComponentActivity r2 = r11.LLILLL
            java.lang.Object r1 = r12.LJJ()
            if (r5 != 0) goto L6d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L77
        L6d:
            kotlin.jvm.internal.AwS409S0200000_8 r1 = new kotlin.jvm.internal.AwS409S0200000_8
            r0 = 102(0x66, float:1.43E-43)
            r1.<init>(r4, r2, r0)
            r12.LJJIJIIJI(r1)
        L77:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r12.LJ()
            r0 = 0
            X.C1671520tbC.LIZ(r3, r1, r12, r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C562680M5a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
