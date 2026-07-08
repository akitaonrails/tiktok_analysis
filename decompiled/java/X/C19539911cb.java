package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19539911cb extends AbstractC1219760hqY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final String LJIIIZ = "UploadAudioFile";
    public final C19523211Zu LJIIJ = new C19523211Zu(this, "UploadAudio");

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19539911cb.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPUploadAudioAbility;", 0);
        C13LE.LIZ.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC19524311a5
    public final String LJIILLIIL() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC1219760hqY
    public final Object LJJIJL(List list) {
        boolean z;
        String str;
        Iterator it2 = list.iterator();
        loop0: while (true) {
            z = true;
            while (it2.hasNext()) {
                InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) it2.next();
                if (!z || (str = (String) LJJIII(interfaceC19526611aS, "VID")) == null || str.length() <= 0) {
                    z = false;
                }
            }
        }
        if (z) {
            return "_CONNECT_ID_DEFAULT";
        }
        return "_CONNECT_ID_TERMINATION_ERROR";
    }

    @Override // X.AbstractC19526011aM
    public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        if (c11zu == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19526611aS.LJJ());
        sbLIZ.append("VID");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long jUptimeMillis = SystemClock.uptimeMillis();
        C11ZT<?> c11zt = c11zu.LIZ.get(strLIZIZ);
        Object obj = null;
        if (c11zt != null) {
            Integer num = c11zt.LIZIZ;
            if (num == null) {
                Object obj2 = c11zt.LIZ;
                if (obj2 instanceof String) {
                    obj = obj2;
                }
            } else if (jUptimeMillis - c11zt.LIZJ < ((long) num.intValue()) * 1000) {
                Object obj3 = c11zt.LIZ;
                if (obj3 instanceof String) {
                    obj = obj3;
                }
            }
        }
        LJJIJIIJI(interfaceC19526611aS, "VID", obj);
        if (obj == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC19526011aM
    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        Object objLJJIII;
        if (c11zu == null || (objLJJIII = LJJIII(interfaceC19526611aS, "VID")) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19526611aS.LJJ());
        sbLIZ.append("VID");
        c11zu.LIZ(null, C2188811AlT.LIZIZ(sbLIZ), objLJJIII);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    @Override // X.AbstractC1219760hqY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIL(X.InterfaceC19526511aR r17, X.InterfaceC19526611aS r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            r16 = this;
            r3 = r19
            r10 = r18
            boolean r0 = r3 instanceof X.C19541511cr
            r9 = r16
            if (r0 == 0) goto La7
            r7 = r3
            X.11cr r7 = (X.C19541511cr) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r7.LLILZ = r2
        L18:
            java.lang.Object r8 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 1
            if (r0 == 0) goto L66
            if (r0 != r5) goto Lae
            X.11aS r10 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L2a:
            X.11dE r8 = (X.C19543811dE) r8
        L2c:
            if (r8 != 0) goto L3c
            java.lang.String r12 = "authKey or ability is empty"
            java.lang.String r13 = r9.LJIIIZ
            X.11YJ r15 = X.C11YJ.CLIENT
            r14 = 0
            r11 = -1
            r9.LJJIIZI(r10, r11, r12, r13, r14, r15)
        L39:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            java.lang.String r0 = r8.LIZ
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L4c
            java.lang.String r1 = "VID"
            java.lang.String r0 = r8.LIZ
            r9.LJJIJIIJI(r10, r1, r0)
            goto L39
        L4c:
            com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader$VideoUploadInfo r2 = r8.LIZIZ
            if (r2 == 0) goto L64
            long r0 = r2.mErrorCode
            int r11 = (int) r0
        L53:
            if (r2 == 0) goto L59
            java.lang.String r12 = r2.mExtra
            if (r12 != 0) goto L5b
        L59:
            java.lang.String r12 = "upload failed"
        L5b:
            java.lang.String r13 = r9.LJIIIZ
            X.11YJ r15 = X.C11YJ.TT_SERVER
            r14 = 0
            r9.LJJIIZI(r10, r11, r12, r13, r14, r15)
            goto L39
        L64:
            r11 = -1
            goto L53
        L66:
            X.C155000ia.LIZIZ(r8)
            java.lang.String r0 = "AUTH_KEY"
            java.lang.Object r4 = r9.LJJIII(r10, r0)
            com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r4 = (com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig) r4
            java.lang.String r0 = "Extract_File_Path"
            java.lang.Object r3 = r9.LJJIII(r10, r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L7d
            java.lang.String r3 = ""
        L7d:
            long r0 = X.C2286708xd.LJIIL(r3)
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            java.lang.String r0 = "pp_data_key_extract_file_size"
            r9.LJJIJIIJI(r10, r0, r1)
            r8 = 0
            if (r4 == 0) goto L2c
            X.11Zu r2 = r9.LJIIJ
            X.1Bqa<java.lang.Object>[] r1 = X.C19539911cb.LJIIJJI
            r0 = 0
            r0 = r1[r0]
            java.lang.Object r0 = r2.getValue(r9, r0)
            X.11d6 r0 = (X.InterfaceC19543011d6) r0
            if (r0 == 0) goto L2c
            r7.LL = r10
            r7.LLILZ = r5
            java.lang.Object r8 = r0.LIZJ(r3, r4, r7)
            if (r8 != r6) goto L2a
            return r6
        La7:
            X.11cr r7 = new X.11cr
            r7.<init>(r9, r3)
            goto L18
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19539911cb.LJJIJIL(X.11aR, X.11aS, X.05Vn):java.lang.Object");
    }
}
