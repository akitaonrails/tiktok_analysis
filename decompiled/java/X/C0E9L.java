package X;

import Y.AObjectS240S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import kotlin.Pair;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E9L, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9L extends AbstractC381020Ewm<InterfaceC358970E5n> implements InterfaceC358970E5n, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C1DRG LLILLL;
    public final C19A3 LLILZ;
    public final InterfaceC358970E5n LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public InterfaceC332260D0u<String> LLJI;
    public InterfaceC332260D0u<String> LLJIJIL;
    public C09AE LLJILJIL;
    public Drawable LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E9L.class, "editorProInitApi", "getEditorProInitApi()Lcom/ss/android/ugc/gamora/editorpro/startup/api/EditorProInitApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E9L.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJ = 8;
    }

    private final boolean T2() {
        String string = C358960E5m.LIZ.getString("reduce_noise_model_path", "");
        if (string.length() == 0) {
            return false;
        }
        C05YQ.LIZ.getClass();
        if (!C2286708xd.LIZJ(string)) {
            return false;
        }
        this.LLJI.setValue(string);
        return true;
    }

    private final VideoPublishEditModel bb2() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    private final C0EGY o2() {
        return (C0EGY) this.LLIZ.getValue(this, LLJILLL[1]);
    }

    private final C0EFH w2() {
        return (C0EFH) this.LLILZLL.getValue(this, LLJILLL[0]);
    }

    @Override // X.InterfaceC358970E5n
    public void li2() {
        if (T2()) {
            return;
        }
        C09AE c09ae = this.LLJILJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJILJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0E9M(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfJ50;
        super.onCreate();
        C0EFH c0efhW2 = w2();
        if (c0efhW2 == null || (c385670FAfJ50 = c0efhW2.J50()) == null) {
            return;
        }
        c385670FAfJ50.LIZ(this, new AObjectS240S0100000_5(this, 62));
    }

    public InterfaceC332260D0u<String> G2() {
        return this.LLJIJIL;
    }

    public InterfaceC358970E5n Z1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC358970E5n
    public /* bridge */ /* synthetic */ C05YD getModelPath() {
        return this.LLJIJIL;
    }

    public final C19A3 getParentScene() {
        return this.LLILZ;
    }

    private final Drawable H2(Context context) {
        if (context == null) {
            return null;
        }
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = C358960E5m.LIZIZ(context);
        }
        return this.LLJILJILJ;
    }

    public void W2(InterfaceC332260D0u<String> interfaceC332260D0u) {
        this.LLJIJIL = interfaceC332260D0u;
    }

    public final Object X1(InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C05YQ c05yq = C05YQ.LIZ;
        String str = this.LLIZLLLIL;
        String str2 = this.LLJ;
        InterfaceC1446480nkE interfaceC1446480nkE = new InterfaceC1446480nkE() { // from class: X.0E9O
            @Override // X.InterfaceC1446480nkE
            public final void onFailure() {
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                }
            }

            @Override // X.InterfaceC1446480nkE
            public final void onSuccess(String str3) {
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<String> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(str3);
                    interfaceC20236714Gf.resumeWith(str3);
                }
            }
        };
        c05yq.getClass();
        C05YQ.LIZ(str, str2, interfaceC1446480nkE);
        c2252611DEt.LJJII(new AwS584S0100000_5(c2252611DEt, 355));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.InterfaceC358970E5n
    public void jt0(NLETrackSlot nLETrackSlot) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEModel nLEModelLLZ;
        C0E55 player;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        C0E48 c0e48W1;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII3;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII4;
        NLEModel nLEModelLLZ2;
        NLETrackSlot nLETrackSlotLIZJ;
        C0E48 c0e48W12;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII5;
        C0E55 player2;
        C0E48 c0e48W13 = W1();
        if (c0e48W13 != null && (interfaceC351350Dq1LLFII = c0e48W13.LLFII()) != null && (nLEModelLLZ = interfaceC351350Dq1LLFII.LLZ()) != null) {
            C0E48 c0e48W14 = W1();
            if (c0e48W14 != null && (player2 = c0e48W14.getPlayer()) != null) {
                player2.pause(false);
            }
            if (nLETrackSlot.hasExtra("extra_associated_vc_slot_id")) {
                String extra = nLETrackSlot.getExtra("extra_associated_vc_slot_id");
                C0E48 c0e48W15 = W1();
                if (c0e48W15 != null && (interfaceC351350Dq1LLFII4 = c0e48W15.LLFII()) != null && (nLEModelLLZ2 = interfaceC351350Dq1LLFII4.LLZ()) != null && (nLETrackSlotLIZJ = C354870Dvh.LIZJ(nLEModelLLZ2, extra)) != null && (c0e48W12 = W1()) != null && (interfaceC351350Dq1LLFII5 = c0e48W12.LLFII()) != null) {
                    interfaceC351350Dq1LLFII5.LJJJJZ(nLETrackSlotLIZJ, EnumC356070Dxd.NONE);
                }
            }
            if (C351220Dpo.LLI(nLETrackSlot)) {
                Pair pairLIZIZ = C350110Do1.LIZIZ(nLEModelLLZ, nLETrackSlot);
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) pairLIZIZ.getFirst();
                pairLIZIZ.getSecond();
                if (nLETrackSlot2 != null && (c0e48W1 = W1()) != null && (interfaceC351350Dq1LLFII3 = c0e48W1.LLFII()) != null) {
                    interfaceC351350Dq1LLFII3.LJJJJZ(nLETrackSlot2, EnumC356070Dxd.NONE);
                }
            }
            C0E48 c0e48W16 = W1();
            if (c0e48W16 != null && (interfaceC351350Dq1LLFII2 = c0e48W16.LLFII()) != null) {
                interfaceC351350Dq1LLFII2.LJJJJZ(nLETrackSlot, EnumC356070Dxd.DONE);
            }
            C0E48 c0e48W17 = W1();
            if (c0e48W17 != null && (player = c0e48W17.getPlayer()) != null) {
                player.LJIJJ();
            }
            c3(false, nLETrackSlot);
        }
    }

    @Override // X.InterfaceC358970E5n
    public void mj1(NLETrackSlot nLETrackSlot) {
        boolean z;
        if (C351220Dpo.LJJLL(nLETrackSlot) != null) {
            z = true;
        } else {
            z = false;
        }
        c3(z, nLETrackSlot);
    }

    @Override // X.InterfaceC358970E5n
    public void wm0(NLETrackSlot nLETrackSlot) {
        String value;
        C0E48 c0e48W1;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEModel nLEModelLLZ;
        C0E48 c0e48W12;
        C0E55 player;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        C0E48 c0e48W13;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII3;
        NLETrackSlot nLETrackSlotLIZJ;
        C0E48 c0e48W14;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII4;
        C0E55 player2;
        InterfaceC332260D0u<String> interfaceC332260D0u = this.LLJIJIL;
        if (interfaceC332260D0u != null && (value = interfaceC332260D0u.getValue()) != null && value.length() != 0 && (c0e48W1 = W1()) != null && (interfaceC351350Dq1LLFII = c0e48W1.LLFII()) != null && (nLEModelLLZ = interfaceC351350Dq1LLFII.LLZ()) != null) {
            C0E48 c0e48W15 = W1();
            if (c0e48W15 != null && (player2 = c0e48W15.getPlayer()) != null) {
                player2.pause(false);
            }
            if (nLETrackSlot.hasExtra("extra_associated_vc_slot_id") && (nLETrackSlotLIZJ = C354870Dvh.LIZJ(nLEModelLLZ, nLETrackSlot.getExtra("extra_associated_vc_slot_id"))) != null && (c0e48W14 = W1()) != null && (interfaceC351350Dq1LLFII4 = c0e48W14.LLFII()) != null) {
                interfaceC351350Dq1LLFII4.LLIIIILZ(nLETrackSlotLIZJ, EnumC356070Dxd.NONE, this.LLJIJIL.getValue());
            }
            if (C351220Dpo.LLI(nLETrackSlot)) {
                Pair pairLIZIZ = C350110Do1.LIZIZ(nLEModelLLZ, nLETrackSlot);
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) pairLIZIZ.getFirst();
                pairLIZIZ.getSecond();
                if (nLETrackSlot2 != null && (c0e48W13 = W1()) != null && (interfaceC351350Dq1LLFII3 = c0e48W13.LLFII()) != null) {
                    interfaceC351350Dq1LLFII3.LLIIIILZ(nLETrackSlot2, EnumC356070Dxd.NONE, this.LLJIJIL.getValue());
                }
            }
            C0E48 c0e48W16 = W1();
            if (c0e48W16 != null && (interfaceC351350Dq1LLFII2 = c0e48W16.LLFII()) != null) {
                interfaceC351350Dq1LLFII2.LLIIIILZ(nLETrackSlot, EnumC356070Dxd.DONE, this.LLJIJIL.getValue());
            }
            C0E48 c0e48W17 = W1();
            if (c0e48W17 != null && (player = c0e48W17.getPlayer()) != null) {
                player.LJIJJ();
            }
            Activity activity = this.LLILZ.mActivity;
            if (activity != null) {
                C1390390mHl c1390390mHl = C1390390mHl.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131834151);
                creativeToastBuilder.duration(2000L);
                ((C1390360mHi) c1390390mHl.createToast(activity, 1074, creativeToastBuilder)).show();
            }
            c3(true, nLETrackSlot);
            VideoPublishEditModel videoPublishEditModelBb2 = bb2();
            if (videoPublishEditModelBb2 != null && (c0e48W12 = W1()) != null) {
                C361680EFy.LJJLIIIJLJLI(videoPublishEditModelBb2, c0e48W12);
            }
        }
    }

    public C0E9L(C1DRG c1drg, C19A3 c19a3) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c19a3;
        this.LLILZIL = this;
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EFH.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLIZLLLIL = "requirement_ftgru";
        this.LLJ = "unet_denoise_44k_music_model_v1.0";
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ("");
        this.LLJI = c2252321DDqLIZ;
        this.LLJIJIL = c2252321DDqLIZ;
    }

    private final void c3(boolean z, NLETrackSlot nLETrackSlot) {
        Drawable drawableH2;
        InterfaceC359850E8x interfaceC359850E8xB20 = o2().B20();
        if (interfaceC359850E8xB20 != null) {
            if (z) {
                drawableH2 = H2(this.LLILZ.getApplicationContext());
            } else {
                drawableH2 = null;
            }
            Keva keva = C358960E5m.LIZ;
            String strLIZ = C358960E5m.LIZ(nLETrackSlot, W1());
            if (strLIZ != null) {
                interfaceC359850E8xB20.LIZ(drawableH2, strLIZ);
            }
        }
    }
}
