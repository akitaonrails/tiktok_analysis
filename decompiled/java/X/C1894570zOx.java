package X;

import android.app.Activity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.ProfileActivityButton;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.ProfileIconViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0zOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894570zOx extends AbstractC1895130zPr {
    public List<ProfileActivityButton> LL;
    public final C736950SvV LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public Activity LLILZIL;
    public C1251150ifB LLILZLL;
    public InterfaceC1894560zOw LLIZ;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        C13LE.LIZ(ProfileIconViewModel.class);
        AFwS271S0000000_28.get$arr$(394);
        new C452070Ho5();
        C724750Sbp.LJII(lifecycleOwner);
        C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:8:0x0019, B:10:0x0029, B:13:0x0031, B:15:0x0039, B:17:0x003f, B:19:0x0045, B:20:0x004a, B:22:0x0050, B:24:0x0056, B:26:0x005a, B:27:0x005d, B:29:0x0063, B:31:0x0067, B:32:0x0071, B:34:0x0075, B:35:0x0079, B:37:0x007f, B:39:0x0083, B:40:0x008e, B:42:0x0092, B:43:0x0095, B:47:0x009f, B:49:0x00a3, B:44:0x0098, B:46:0x009c), top: B:54:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            r6 = this;
            X.01GW<X.0zPA> r0 = X.C1894700zPA.LJIJ
            X.0zPA r1 = X.C2178808gE.LIZ()
            r0 = 3
            X.0zNV r4 = r1.LJ(r0)
            com.bytedance.touchpoint.api.model.ProfileActivityIcon r4 = (com.bytedance.touchpoint.api.model.ProfileActivityIcon) r4
            android.app.Activity r0 = r6.LLILZIL
            if (r0 == 0) goto Lab
            X.0ifB r2 = r6.LLILZLL
            if (r2 == 0) goto Lab
            X.0zOw r0 = r6.LLIZ
            if (r0 == 0) goto Lab
            kotlin.jvm.internal.AwS394S0200000_28 r1 = new kotlin.jvm.internal.AwS394S0200000_28     // Catch: java.lang.Throwable -> La7
            r0 = 85
            r1.<init>(r6, r4, r0)     // Catch: java.lang.Throwable -> La7
            r2.LIZLLL()     // Catch: java.lang.Throwable -> La7
            r2.LJFF = r1     // Catch: java.lang.Throwable -> La7
            r5 = 0
            r2 = 1
            if (r4 == 0) goto L98
            java.lang.String r1 = r4.iconUrl     // Catch: java.lang.Throwable -> La7
            java.util.List<com.bytedance.touchpoint.api.model.ProfileActivityButton> r0 = r4.profileActivityButtons     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L98
            if (r0 == 0) goto L98
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La7
            r0 = r0 ^ 1
            if (r0 == 0) goto L98
            int r0 = r1.length()     // Catch: java.lang.Throwable -> La7
            if (r0 <= 0) goto L98
            java.lang.String r0 = r4.iconUrl     // Catch: java.lang.Throwable -> La7
            java.util.List<com.bytedance.touchpoint.api.model.ProfileActivityButton> r3 = r4.profileActivityButtons     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L4a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La7
            r3.<init>()     // Catch: java.lang.Throwable -> La7
        L4a:
            r6.LL = r3     // Catch: java.lang.Throwable -> La7
            r6.LLILLL = r2     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L9f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> La7
            if (r0 != 0) goto L9f
            X.0zOw r0 = r6.LLIZ     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L5d
            r0.LIZ()     // Catch: java.lang.Throwable -> La7
        L5d:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> La7
            if (r0 != r2) goto L79
            X.0ifB r2 = r6.LLILZLL     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L71
            kotlin.jvm.internal.AwS272S0300000_28 r1 = new kotlin.jvm.internal.AwS272S0300000_28     // Catch: java.lang.Throwable -> La7
            r0 = 17
            r1.<init>(r6, r4, r3, r0)     // Catch: java.lang.Throwable -> La7
            r2.LIZJ(r1)     // Catch: java.lang.Throwable -> La7
        L71:
            X.0zOw r0 = r6.LLIZ     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L9f
            r0.LIZLLL()     // Catch: java.lang.Throwable -> La7
            goto L9f
        L79:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> La7
            if (r0 <= r2) goto L8e
            X.0ifB r2 = r6.LLILZLL     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L71
            kotlin.jvm.internal.AwS272S0300000_28 r1 = new kotlin.jvm.internal.AwS272S0300000_28     // Catch: java.lang.Throwable -> La7
            r0 = 18
            r1.<init>(r6, r4, r3, r0)     // Catch: java.lang.Throwable -> La7
            r2.LIZJ(r1)     // Catch: java.lang.Throwable -> La7
            goto L71
        L8e:
            X.0zOw r0 = r6.LLIZ     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L95
            r0.LJI()     // Catch: java.lang.Throwable -> La7
        L95:
            r6.LLILLL = r5     // Catch: java.lang.Throwable -> La7
            goto L71
        L98:
            X.0zOw r0 = r6.LLIZ     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L9f
            r0.LJI()     // Catch: java.lang.Throwable -> La7
        L9f:
            X.0zOw r0 = r6.LLIZ     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto Lab
            r0.LIZJ()     // Catch: java.lang.Throwable -> La7
            return
        La7:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1894570zOx.LJIIJ():void");
    }

    public C1894570zOx() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        C736950SvV c736950SvV = new C736950SvV(C13LE.LIZ(ProfileIconViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(393), null, null, null);
        this.LLILLJJLI = c736950SvV;
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zOz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1895080zPm) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS598S0100000_19(this, 817));
    }
}
