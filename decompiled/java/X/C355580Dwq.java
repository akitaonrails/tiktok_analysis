package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Dwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355580Dwq extends C0EH9 {
    public final C0EGH LLJILJIL;
    public final ArrayList<String> LLJILJILJ;
    public final ArrayList<String> LLJILLL;
    public final C01GW LLJJ;

    public static final VideoPublishEditModel LJIILJJIL() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    @Override // X.C0EHG
    public final boolean LJ(C361980EHc c361980EHc) {
        return this.LLJILJILJ.contains(c361980EHc.LJI);
    }

    @Override // X.C0E96, X.C0EHG
    public final boolean LJII(C361980EHc c361980EHc) {
        if (TextUtils.equals(c361980EHc.LJI, "bottom_item_root_effects")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r11) {
        /*
            r10 = this;
            android.app.Activity r1 = r10.LJIIIZ()
            int r0 = r10.LLILLL
            android.view.View r0 = r1.findViewById(r0)
            boolean r0 = X.C0OBG.LIZIZ(r0)
            if (r0 == 0) goto L11
            return
        L11:
            java.lang.String r1 = "bottom_item_root_effects"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r11, r1)
            java.lang.String r6 = "bottom_item_effect_add_effects"
            if (r0 == 0) goto Lb7
            java.lang.String r5 = "effect_tab"
        L1d:
            X.01GW r0 = r10.LLJJ
            java.lang.Object r0 = r0.getValue()
            X.0Dwp r0 = (X.C355570Dwp) r0
            java.lang.String r4 = "editor_pro_panel"
            if (r0 == 0) goto L82
            X.0EEj r2 = r0.LIZIZ()
            if (r2 == 0) goto L82
            X.0E48 r7 = r10.LJIIJ()
            if (r7 == 0) goto L82
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r11, r1)
            if (r0 == 0) goto Laf
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = LJIILJJIL()
            if (r1 == 0) goto L4a
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r1.creativeModel
            r0.effectEntrancePosition = r4
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C361680EFy.LJJIJIIJI(r1, r7, r0, r5)
        L4a:
            X.0E48 r0 = r10.LJIIJ()
            if (r0 == 0) goto Lad
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r0)
            if (r0 == 0) goto Lad
            java.util.List r0 = X.C351220Dpo.LJJIJLIJ(r0)
            if (r0 == 0) goto Lad
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 != r0) goto Lad
        L63:
            X.0E9o r3 = new X.0E9o
            r3.<init>(r7, r5, r2, r0)
        L68:
            com.bytedance.ies.nle.editor_jni.NLEModel r2 = X.C350870DpF.LJI(r7)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "enter_add_effect_time"
            r2.setExtra(r0, r1)
            X.19A3 r2 = r10.LL
            java.lang.Class<X.0ET8> r1 = X.C0ET8.class
            r0 = 16
            X.C375820EoO.LIZ(r2, r7, r1, r3, r0)
        L82:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r11, r6)
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = LJIILJJIL()
            if (r2 == 0) goto Lac
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r2.creativeModel
            r0.effectEntrancePosition = r4
            X.0E48 r1 = r10.LJIIJ()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            X.C361680EFy.LJJIJIIJI(r2, r1, r0, r5)
            java.lang.String r1 = "add"
            X.0E48 r3 = r10.LJIIJ()
            java.lang.String r4 = "effect"
            r5 = 0
            r7 = 0
            r9 = 1000(0x3e8, float:1.401E-42)
            r6 = r5
            r8 = r7
            X.C361680EFy.LJJJI(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        Lac:
            return
        Lad:
            r0 = 0
            goto L63
        Laf:
            X.0E9o r3 = new X.0E9o
            r0 = 8
            r3.<init>(r7, r5, r2, r0)
            goto L68
        Lb7:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r11, r6)
            if (r0 == 0) goto Lc1
            java.lang.String r5 = "effect_panel"
            goto L1d
        Lc1:
            java.lang.String r5 = ""
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355580Dwq.LJIILL(java.lang.String):void");
    }

    public C355580Dwq(C19A3 c19a3, C1DRG c1drg, C0EGH c0egh) {
        super(c19a3, c1drg, R.id.gcw);
        this.LLJILJIL = c0egh;
        c0egh.LJII = new AwS584S0100000_5(this, 1102);
        this.LLJILJILJ = C1697810uHb.LJ("bottom_item_root_effects", "bottom_item_effect_add_effects", "bottom_item_effect_edit_replace_effect", "bottom_item_effect_edit_copy", "bottom_item_effect_edit_delete", "bottom_item_add_video_animation");
        this.LLJILLL = C1697810uHb.LJ("bottom_item_effect_edit_replace_effect", "bottom_item_effect_edit_copy", "bottom_item_effect_edit_delete");
        this.LLJJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(396));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0346  */
    @Override // X.C0EHG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C361980EHc r18, android.view.View r19, java.util.Map<java.lang.String, java.lang.String> r20) {
        /*
            Method dump skipped, instruction units count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C355580Dwq.LIZJ(X.0EHc, android.view.View, java.util.Map):void");
    }
}
