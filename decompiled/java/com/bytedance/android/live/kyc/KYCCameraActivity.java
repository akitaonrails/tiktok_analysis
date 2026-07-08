package com.bytedance.android.live.kyc;

import X.AbstractC19484711Kz;
import X.C09JN;
import X.C1143680frq;
import X.C11S5;
import X.C1295960jpS;
import X.C12ES;
import X.C16F5;
import X.C1701940uOG;
import X.C1808400x9y;
import X.C19GS;
import X.C20296814bO;
import X.C20297214bS;
import X.C20297414bU;
import X.C20856616jU;
import X.C2500909r5;
import X.C439101nJ;
import X.C783270Uo1;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.DialogC20297314bT;
import X.InterfaceC1808410x9z;
import X.InterfaceC1870050ylP;
import X.InterfaceC300801Eo;
import Y.AAListenerS340S0100000_30;
import Y.ACListenerS164S0100000_30;
import Y.AfS139S0200000_3;
import Y.AfS172S0100000_3;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import wh6.AbS709S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class KYCCameraActivity extends C19GS {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6HELIOSPiBiIjYwZg4VCgwyJSA+KA4wPCw6IDsq";
    public ImageView LL;
    public C16F5 LLILLJJLI;
    public C20856616jU LLILLL;
    public C20296814bO LLILZ;
    public C1295960jpS LLILZIL;
    public TextView LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public JSONObject LLJ;
    public boolean LLJI;
    public boolean LLJIJIL = true;
    public final List<byte[]> LLJILJIL = new ArrayList();
    public C20297214bS LLJILJILJ = new InterfaceC1870050ylP() { // from class: X.14bS
        @Override // X.InterfaceC1870050ylP
        public final void LIZ(byte[] bArr) {
            ((ArrayList) this.LIZ.LLJILJIL).add(bArr);
            KYCCameraActivity kYCCameraActivity = this.LIZ;
            if (kYCCameraActivity.LLJI) {
                if (((ArrayList) kYCCameraActivity.LLJILJIL).size() == 1) {
                    KYCCameraActivity kYCCameraActivity2 = this.LIZ;
                    C1295960jpS c1295960jpS = kYCCameraActivity2.LLILZIL;
                    if (c1295960jpS != null) {
                        c1295960jpS.playAnimation();
                    }
                    TextView textView = kYCCameraActivity2.LLILZLL;
                    if (textView != null) {
                        textView.setText(kYCCameraActivity2.getString(2131842377));
                    }
                    kYCCameraActivity2.LLJIJIL = false;
                    C20296814bO c20296814bO = kYCCameraActivity2.LLILZ;
                    if (c20296814bO != null) {
                        c20296814bO.LJFF = false;
                    }
                    C20297414bU.LIZJ(kYCCameraActivity2.LLLLLZL(), kYCCameraActivity2.getPageName(), kYCCameraActivity2.LLJ);
                    return;
                }
                KYCCameraActivity kYCCameraActivity3 = this.LIZ;
                kYCCameraActivity3.LLLLZI(kYCCameraActivity3.LLJILJIL, true);
                return;
            }
            kYCCameraActivity.LLLLZI(kYCCameraActivity.LLJILJIL, true);
        }
    };

    public final String LLLLLZL() {
        return this.LLIZLLLIL == 3 ? "double_side" : "single_side";
    }

    public final String getPageName() {
        return this.LLJIJIL ? "profile_image_side" : "back_image_side";
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        C20297414bU.LIZ(LLLLLZL(), getPageName(), this.LLJ);
        C20297414bU.LIZIZ(LLLLLZL(), getPageName(), "cancel", this.LLJ);
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C20296814bO c20296814bO = this.LLILZ;
        if (c20296814bO != null) {
            c20296814bO.LIZ();
        }
        this.LLJILJILJ = null;
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        C20296814bO c20296814bO = this.LLILZ;
        if (c20296814bO != null) {
            c20296814bO.LJIIZILJ = null;
        }
    }

    @Override // X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        super.onResume();
        C20296814bO c20296814bO = this.LLILZ;
        if (c20296814bO != null) {
            c20296814bO.LJIIZILJ = new BPEAHandler(C783270Uo1.LIZIZ());
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        super.onCreate(bundle);
        setContentView(R.layout.fxb);
        boolean z3 = false;
        this.LLIZ = getIntent().getIntExtra("key_kyc_photo_type", 0);
        this.LLIZLLLIL = getIntent().getIntExtra("key_kyc_photo_side", 0);
        try {
            String stringExtra = getIntent().getStringExtra("key_kyc_track_events");
            if (stringExtra != null && stringExtra.length() > 0) {
                try {
                    this.LLJ = new JSONObject(stringExtra);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        int i = this.LLIZLLLIL;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        this.LLJI = z;
        if (i != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJIJIL = z2;
        TextView textView = (TextView) findViewById(R.id.ys2);
        this.LLILZLL = textView;
        if (this.LLIZ != 0 && this.LLIZLLLIL != 0) {
            if (textView != null) {
                C12ES.LJIILL(0, textView);
            }
            if (this.LLIZLLLIL == 2) {
                TextView textView2 = this.LLILZLL;
                if (textView2 != null) {
                    textView2.setText(getString(2131842377));
                }
            } else {
                TextView textView3 = this.LLILZLL;
                if (textView3 != null) {
                    textView3.setText(getString(2131842382));
                }
            }
        } else if (textView != null) {
            C439101nJ.LJI(textView);
        }
        getWindow().setStatusBarColor(-16777216);
        getWindow().setNavigationBarColor(-16777216);
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ys4);
            this.LL = (ImageView) callbackFindViewById;
        }
        C786410Ut5.Q7((ImageView) callbackFindViewById, new AbS709S0100000_30(this, 5));
        KeyEvent.Callback callbackFindViewById2 = this.LLILLJJLI;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.yrw);
            this.LLILLJJLI = (C16F5) callbackFindViewById2;
        }
        C786410Ut5.l8((C16F5) callbackFindViewById2, new ACListenerS164S0100000_30(this, 41));
        if (this.LLJI) {
            C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.yrx);
            this.LLILZIL = c1295960jpS;
            if (c1295960jpS != null) {
                c1295960jpS.addAnimatorListener(new AAListenerS340S0100000_30(this, 2));
            }
            C1143680frq.LJIIL(this.LLILZIL, "tiktok_live_wallet_resource", "kyc_4_card_flip_lottie.zip", "images", false, null, Boolean.FALSE, null);
        }
        DialogC20297314bT dialogC20297314bT = new DialogC20297314bT(this, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        dialogC20297314bT.show();
        C785410UrT.LIZIZ(dialogC20297314bT);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC20297314bT);
        C816490W1f.LIZ(dialogC20297314bT);
        C20297414bU.LJ(LLLLLZL(), "photo_guidance", this.LLJ);
        KeyEvent.Callback callbackFindViewById3 = this.LLILLL;
        if (callbackFindViewById3 == null) {
            callbackFindViewById3 = findViewById(R.id.d_f);
            this.LLILLL = (C20856616jU) callbackFindViewById3;
        }
        C20296814bO c20296814bO = new C20296814bO(this, (C20856616jU) callbackFindViewById3, this.LLJILJILJ, this.LLJI, this.LLJ);
        if (this.LLIZLLLIL != 2) {
            z3 = true;
        }
        c20296814bO.LJFF = z3;
        this.LLILZ = c20296814bO;
        C20297414bU.LIZJ(LLLLLZL(), getPageName(), this.LLJ);
    }

    public final void LLLLZI(final List list, boolean z) {
        if (!z) {
            LLLLZIL(new ArrayList(), false);
        } else {
            AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.09mi
                /* JADX WARN: Removed duplicated region for block: B:49:0x00b2 A[Catch: Exception -> 0x00b6, TRY_LEAVE, TryCatch #8 {Exception -> 0x00b6, blocks: (B:47:0x00ad, B:49:0x00b2), top: B:95:0x00ad }] */
                /* JADX WARN: Removed duplicated region for block: B:95:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // X.InterfaceC300801Eo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void subscribe(X.InterfaceC2329309At<java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> r19) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 376
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2473809mi.subscribe(X.09At):void");
                }
            }).LJJ(C1701940uOG.LIZIZ()).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new AfS172S0100000_3((Object) this, 61), new AfS172S0100000_3((Object) this, 62));
        }
    }

    public final void LLLLZIL(List list, boolean z) {
        String str;
        C1808400x9y.LIZ.getClass();
        Iterator<InterfaceC1808410x9z> it2 = C1808400x9y.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(list, z);
        }
        C1808400x9y.LIZIZ.LL.clear();
        String strLLLLLZL = LLLLLZL();
        String pageName = getPageName();
        if (z) {
            str = "complete";
        } else {
            str = "cancel";
        }
        C20297414bU.LIZIZ(strLLLLLZL, pageName, str, this.LLJ);
        finish();
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1001 || intent == null) {
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new ArrayList();
        }
        C20296814bO c20296814bO = this.LLILZ;
        if (c20296814bO != null) {
            C786410Ut5.L4(c20296814bO.LJIJ);
        }
        AbstractC19484711Kz.LJII(new C2500909r5(this, parcelableArrayListExtra, 1)).LJJ(C1701940uOG.LIZIZ()).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new AfS139S0200000_3(parcelableArrayListExtra, this, (Function1<? super Drawable, Unit>) 7), new C09JN() { // from class: X.00Kn
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("KYCCameraActivity@7f9f.processGalleryPhotos$disposable$3");
                C1C7U.LIZIZ("KYCCameraActivity@7f9f.processGalleryPhotos$disposable$3");
            }
        });
    }
}
