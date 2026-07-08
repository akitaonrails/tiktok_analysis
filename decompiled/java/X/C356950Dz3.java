package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Dz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356950Dz3 implements InterfaceC369050EdT, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final InterfaceC356960Dz4 LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1201));
    public final C1664740tQG LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C356950Dz3.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC369050EdT
    public final void LIZLLL() {
    }

    public final boolean LJFF() {
        C0E48 c0e48 = (C0E48) this.LLILLL.getValue();
        if (c0e48 == null) {
            return false;
        }
        C0EY2 c0ey2 = (C0EY2) this.LLILZ.getValue(this, LLILZIL[0]);
        VideoPublishEditModel editModel = c0ey2 != null ? c0ey2.getEditModel() : null;
        ArrayList<NLETrack> arrayListLJ = C349550Dn7.LJ(C350870DpF.LJI(c0e48));
        if ((editModel == null || !C1416310mxZ.LJIILL(editModel)) && arrayListLJ.size() <= 1) {
            if (arrayListLJ.isEmpty()) {
                return false;
            }
            Iterator<NLETrack> it2 = arrayListLJ.iterator();
            while (it2.hasNext()) {
                if (it2.next().getLayer() > 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    @Override // X.InterfaceC369050EdT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C356980Dz6 LIZJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r9) {
        /*
            r8 = this;
            X.01GW r0 = r8.LLILLL
            java.lang.Object r6 = r0.getValue()
            X.0E48 r6 = (X.C0E48) r6
            r4 = 1
            if (r6 != 0) goto L11
            X.0Dz6 r0 = new X.0Dz6
            r0.<init>(r4, r4)
            return r0
        L11:
            X.0tQG r1 = r8.LLILZ
            X.1Bqa<java.lang.Object>[] r0 = X.C356950Dz3.LLILZIL
            r3 = 0
            r0 = r0[r3]
            java.lang.Object r0 = r1.getValue(r8, r0)
            X.0EY2 r0 = (X.C0EY2) r0
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5 = r0.getEditModel()
        L24:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r6)
            com.bytedance.ies.nle.editor_jni.NLETrack r7 = r0.getTrackBySlot(r9)
            boolean r0 = X.C361460EFc.LIZ(r5)
            if (r0 != 0) goto L4b
            if (r7 == 0) goto L4b
            boolean r0 = X.C351220Dpo.LLJLL(r7)
            if (r0 != r4) goto L4b
            kotlin.Unit r2 = kotlin.Unit.LIZ
            X.0DpP r1 = r6.S7()
            java.lang.String r0 = "event_click_disable_replace_music_with_loop"
            r1.LIZIZ(r2, r0, r3)
        L45:
            X.0Dz6 r0 = new X.0Dz6
            r0.<init>(r4, r3)
            return r0
        L4b:
            if (r9 == 0) goto L74
            boolean r0 = X.C349550Dn7.LJFF(r9)
            if (r0 != r4) goto L5b
            boolean r0 = r8.LJFF()
            if (r0 == 0) goto L61
            if (r9 == 0) goto L74
        L5b:
            boolean r0 = X.C351220Dpo.LLLLIL(r9)
            if (r0 != r4) goto L74
        L61:
            boolean r0 = X.C351220Dpo.LLJJL(r9)
            if (r0 != 0) goto L6d
            boolean r0 = X.C351220Dpo.LLLIIIIL(r9)
            if (r0 == 0) goto L45
        L6d:
            X.0Dz4 r0 = r8.LLILLJJLI
            r0.LIZ()
            r4 = 0
            goto L45
        L74:
            if (r7 == 0) goto La1
            boolean r0 = X.C351220Dpo.LLJILLL(r7)
            if (r0 != r4) goto La1
            r0 = 1
        L7d:
            java.lang.String r2 = "ep_audio_music_id"
            java.lang.String r1 = ""
            if (r0 != 0) goto La3
            if (r7 == 0) goto L9f
            boolean r0 = X.C351220Dpo.LLILLL(r7)
            if (r0 == r4) goto La3
            boolean r0 = X.C351220Dpo.LLLILZLLLI(r7)
            if (r0 != r4) goto L9f
            if (r5 == 0) goto L9f
            if (r9 == 0) goto L9c
            java.lang.String r0 = r9.getExtra(r2)
            if (r0 == 0) goto L9c
            r1 = r0
        L9c:
            X.C0EC5.LJIIIIZZ(r5, r6, r1, r3)
        L9f:
            r3 = 1
            goto L45
        La1:
            r0 = 0
            goto L7d
        La3:
            if (r5 == 0) goto L45
            if (r9 == 0) goto Lae
            java.lang.String r0 = r9.getExtra(r2)
            if (r0 == 0) goto Lae
            r1 = r0
        Lae:
            X.C0EC5.LJIIIIZZ(r5, r6, r1, r4)
            goto L45
        Lb2:
            r5 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C356950Dz3.LIZJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot):X.0Dz6");
    }

    public C356950Dz3(C1DRG c1drg, C0E45 c0e45) {
        this.LL = c1drg;
        this.LLILLJJLI = c0e45;
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    @Override // X.InterfaceC369050EdT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(int r6, com.bytedance.ies.nle.editor_jni.NLETrackSlot r7) {
        /*
            r5 = this;
            X.01GW r0 = r5.LLILLL
            java.lang.Object r2 = r0.getValue()
            X.0E48 r2 = (X.C0E48) r2
            r4 = 1
            if (r2 != 0) goto Lc
            return r4
        Lc:
            if (r7 == 0) goto L9e
            boolean r0 = X.C348850Dlz.LJI(r7, r2)
            r3 = 0
            if (r0 == 0) goto L2a
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r2)
            java.util.List r0 = X.C349930Dnj.LJFF(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L2a
            if (r6 != 0) goto L2a
            return r3
        L2a:
            boolean r0 = X.C349550Dn7.LJI(r7)
            if (r0 == 0) goto L43
            if (r6 != 0) goto L43
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r2)
            boolean r0 = X.C349560Dn8.LJFF(r0)
            if (r0 == 0) goto L43
            boolean r0 = r5.LJFF()
            if (r0 != 0) goto L43
            return r3
        L43:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r2)
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r1 = r0.getTracks()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L61
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L61
        L55:
            r1 = 0
        L56:
            boolean r0 = X.C351220Dpo.LLJJI(r7)
            if (r0 == 0) goto L79
            if (r6 != 0) goto L79
            if (r1 == 0) goto L79
            return r3
        L61:
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            boolean r0 = X.C351220Dpo.LLLLILI(r0)
            if (r0 == 0) goto L65
            r1 = 1
            goto L56
        L79:
            boolean r0 = X.C351220Dpo.LLJJI(r7)
            if (r0 == 0) goto L9e
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C350870DpF.LJI(r2)
            java.util.List r0 = X.C351220Dpo.LJJIJLIJ(r0)
            java.lang.Object r0 = X.C13LP.LJJLIIIJL(r0)
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r0 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r0
            if (r0 == 0) goto L9c
            int r0 = r0.getLayer()
        L93:
            int r1 = r0 + 1
            int r0 = X.C356600DyU.LJ()
            if (r1 < r0) goto L9e
            return r3
        L9c:
            r0 = -1
            goto L93
        L9e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C356950Dz3.LIZ(int, com.bytedance.ies.nle.editor_jni.NLETrackSlot):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b1  */
    @Override // X.InterfaceC369050EdT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C356970Dz5 LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r12, int r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C356950Dz3.LIZIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, int, boolean, boolean):X.0Dz5");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    @Override // X.InterfaceC369050EdT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(long r16, com.bytedance.ies.nle.editor_jni.NLETrackSlot r18, int r19, long r20) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C356950Dz3.LJ(long, com.bytedance.ies.nle.editor_jni.NLETrackSlot, int, long):boolean");
    }
}
