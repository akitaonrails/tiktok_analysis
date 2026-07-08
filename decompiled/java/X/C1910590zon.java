package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.ss.android.ugc.aweme.compliance.api.model.Organization;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerViewModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0zon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910590zon extends FrameLayout implements LifecycleEventObserver {
    public SparkFragment LL;
    public C1910500zoe LLILLJJLI;
    public FragmentManager LLILLL;
    public FundraiserContainerViewModel LLILZ;
    public LifecycleOwner LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public String LLJI;
    public boolean LLJIJIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Lifecycle lifecycle;
        Fragment fragmentLJJJJZI;
        super.onDetachedFromWindow();
        FragmentManager fragmentManager = this.LLILLL;
        if (fragmentManager != null && (fragmentLJJJJZI = fragmentManager.LJJJJZI("EditFundraiserSparkFragment")) != null) {
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            c19ehLJIIJ.LJIIJ();
        }
        C1910500zoe c1910500zoe = this.LLILLJJLI;
        if (c1910500zoe != null) {
            c1910500zoe.LIZLLL();
        }
        C1910500zoe c1910500zoe2 = this.LLILLJJLI;
        if (c1910500zoe2 != null) {
            c1910500zoe2.LLILZ = null;
        }
        this.LLILLJJLI = null;
        LifecycleOwner lifecycleOwner = this.LLILZIL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LL = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public C1910590zon(Context context) {
        super(context, null, 0);
        this.LLILZLL = "";
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJI = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[PHI: r5
      0x000b: PHI (r5v4 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:7:0x0009, B:5:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.compliance.api.model.Organization r8) {
        /*
            r7 = this;
            java.lang.String r6 = ""
            if (r8 == 0) goto L8
            java.lang.String r5 = r8.orgId
            if (r5 != 0) goto Lb
        L8:
            r5 = r6
            if (r8 == 0) goto L10
        Lb:
            java.lang.String r0 = r8.fundraiserId
            if (r0 == 0) goto L10
            r6 = r0
        L10:
            int r0 = r5.length()
            r4 = 1
            r3 = 0
            if (r0 <= 0) goto L4e
            java.lang.String r0 = r7.LLILZLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L4e
            r2 = 1
        L21:
            int r0 = r6.length()
            if (r0 <= 0) goto L30
            java.lang.String r0 = r7.LLIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 != 0) goto L30
            r3 = 1
        L30:
            r7.LLJIJIL = r4
            if (r2 != 0) goto L3f
            if (r3 != 0) goto L3f
            com.ss.android.ugc.aweme.compliance.business.fundraiser.native.FundraiserContainerViewModel r1 = r7.LLILZ
            if (r1 == 0) goto L3e
            r0 = 0
            r1.xQ2(r0, r0, r4)
        L3e:
            return
        L3f:
            com.ss.android.ugc.aweme.compliance.business.fundraiser.native.FundraiserContainerViewModel r1 = r7.LLILZ
            if (r1 == 0) goto L3e
            r0 = 0
            if (r2 != 0) goto L47
            r5 = r0
        L47:
            if (r3 != 0) goto L4a
            r6 = r0
        L4a:
            r1.xQ2(r5, r6, r4)
            return
        L4e:
            r2 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1910590zon.LIZ(com.ss.android.ugc.aweme.compliance.api.model.Organization):void");
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LLILZIL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C2023007wC.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1910500zoe c1910500zoe = this.LLILLJJLI;
                if (c1910500zoe != null) {
                    c1910500zoe.LIZLLL();
                }
                C1910500zoe c1910500zoe2 = this.LLILLJJLI;
                if (c1910500zoe2 != null) {
                    c1910500zoe2.LLILZ = null;
                }
                this.LLILLJJLI = null;
                return;
            }
            return;
        }
        C1910500zoe c1910500zoe3 = new C1910500zoe();
        this.LLILLJJLI = c1910500zoe3;
        c1910500zoe3.LLILZ = new InterfaceC1910510zof() { // from class: X.0zoo
            @Override // X.InterfaceC1910510zof
            public final void LJ(Organization organization, Map<String, String> map) {
            }

            @Override // X.InterfaceC1910510zof
            public final void LJFF(Organization organization, boolean z, Map<String, String> map) {
            }

            @Override // X.InterfaceC1910510zof
            public final void LIZJ() {
                FundraiserContainerViewModel fundraiserContainerViewModel = this.LIZ.LLILZ;
                if (fundraiserContainerViewModel != null) {
                    fundraiserContainerViewModel.xQ2(null, null, false);
                }
            }

            @Override // X.InterfaceC1910510zof
            public final void onCanceled() {
                FundraiserContainerViewModel fundraiserContainerViewModel = this.LIZ.LLILZ;
                if (fundraiserContainerViewModel != null) {
                    fundraiserContainerViewModel.xQ2(null, null, false);
                }
            }

            @Override // X.InterfaceC1910510zof
            public final void LIZLLL(Organization organization, Map<String, String> map) {
                this.LIZ.LIZ(organization);
            }

            @Override // X.InterfaceC1910510zof
            public final void LJI(Organization organization, Map<String, String> map) {
                this.LIZ.LIZ(organization);
            }
        };
        c1910500zoe3.LIZIZ();
    }
}
