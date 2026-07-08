package X;

import android.util.SparseArray;
import com.bytedance.im.core.proto.ReferenceInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS229S0000000_2;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873550YOr {
    public static final String LIZLLL(InterfaceC873710YPh interfaceC873710YPh) {
        if (interfaceC873710YPh instanceof C0YP4) {
            return ((C0YP4) interfaceC873710YPh).LIZIZ;
        }
        if (interfaceC873710YPh instanceof C0YPW) {
            return ((C0YPW) interfaceC873710YPh).LIZ.getUuid();
        }
        if (interfaceC873710YPh instanceof C1168904hj) {
            interfaceC873710YPh.getClass();
            return null;
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C0YEM r9, java.lang.String r10, X.InterfaceC1364105Vn<? super X.C0Y6Q<X.C0Y8T>> r11) {
        /*
            boolean r0 = r11 instanceof X.C0YPH
            if (r0 == 0) goto L22
            r6 = r11
            X.0YPH r6 = (X.C0YPH) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r8 = 1
            if (r0 == 0) goto L34
            if (r0 != r8) goto L2c
            X.0YEM r9 = r6.LL
            goto L28
        L22:
            X.0YPH r6 = new X.0YPH
            r6.<init>(r11)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C872730YLn -> L8d
            goto L77
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            long r0 = r9.getUid()
            long r2 = X.C2124408Ty.LIZIZ(r0, r10)
            X.0XwD r0 = r9.LJIIZILJ()
            X.0Y5r r0 = r0.LIZLLL()
            X.0Y60 r5 = r0.LIZ()
            r6.LL = r9     // Catch: X.C872730YLn -> L8d
            r6.LLILLJJLI = r5     // Catch: X.C872730YLn -> L8d
            r6.LLILZ = r8     // Catch: X.C872730YLn -> L8d
            X.1DEt r4 = new X.1DEt     // Catch: X.C872730YLn -> L8d
            X.05Vn r0 = X.C099M.LIZLLL(r6)     // Catch: X.C872730YLn -> L8d
            r4.<init>(r8, r0)     // Catch: X.C872730YLn -> L8d
            r4.LJIJJ()     // Catch: X.C872730YLn -> L8d
            X.0Ztd r1 = new X.0Ztd     // Catch: X.C872730YLn -> L8d
            r0 = 22
            r1.<init>(r4, r0)     // Catch: X.C872730YLn -> L8d
            r5.LJJJJZI(r2, r1)     // Catch: X.C872730YLn -> L8d
            java.lang.Object r1 = r4.LJIJ()     // Catch: X.C872730YLn -> L8d
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: X.C872730YLn -> L8d
            if (r1 != r0) goto L74
            X.C099Q.LIZJ(r6)     // Catch: X.C872730YLn -> L8d
        L74:
            if (r1 != r7) goto L77
            return r7
        L77:
            if (r1 != 0) goto L88
            X.0YPY r3 = new X.0YPY     // Catch: X.C872730YLn -> L8d
            java.lang.String r2 = "createSingleConversationWithTemp returned null"
            r1 = 0
            r0 = -1046(0xfffffffffffffbea, float:NaN)
            r3.<init>(r0, r2, r1, r1)     // Catch: X.C872730YLn -> L8d
            X.0Y6Q r0 = X.C865670Xxd.LIZIZ(r3)     // Catch: X.C872730YLn -> L8d
            return r0
        L88:
            X.0Y6Q r0 = X.C865670Xxd.LIZJ(r1)     // Catch: X.C872730YLn -> L8d
            return r0
        L8d:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.0Y6i r3 = r9.LIZLLL()
            java.lang.String r2 = "conversation creation failed, ABORT"
            java.lang.String r1 = "PrepareLocalMessageForSend"
            r0 = 0
            r3.LJIIIIZZ(r1, r2, r0)
            X.0YMW r1 = r4.getError()
            if (r1 == 0) goto Lb1
            X.0YPP r0 = X.C0YPQ.Companion
            r0.getClass()
            X.0YPR r0 = X.C0YPP.LIZIZ(r1)
        Lac:
            X.0Y6Q r0 = X.C865670Xxd.LIZIZ(r0)
            return r0
        Lb1:
            X.0YPP r0 = X.C0YPQ.Companion
            r0.getClass()
            X.0YPQ r0 = X.C0YPP.LIZ(r4)
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873550YOr.LIZ(X.0YEM, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(X.C0YEM r6, long r7, X.InterfaceC1364105Vn<? super X.C0Y6Q<X.C0Y8T>> r9) {
        /*
            boolean r0 = r9 instanceof X.C0YPI
            if (r0 == 0) goto L22
            r5 = r9
            X.0YPI r5 = (X.C0YPI) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.0YEM r6 = r5.LL
            goto L28
        L22:
            X.0YPI r5 = new X.0YPI
            r5.<init>(r9)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r2)     // Catch: X.C872730YLn -> L85
            goto L6f
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r2)
            X.0XwD r0 = r6.LJIIZILJ()
            X.0Y5r r0 = r0.LIZLLL()
            X.0Y60 r3 = r0.LIZ()
            r5.LL = r6     // Catch: X.C872730YLn -> L85
            r5.LLILLJJLI = r3     // Catch: X.C872730YLn -> L85
            r5.LLILZ = r1     // Catch: X.C872730YLn -> L85
            X.1DEt r2 = new X.1DEt     // Catch: X.C872730YLn -> L85
            X.05Vn r0 = X.C099M.LIZLLL(r5)     // Catch: X.C872730YLn -> L85
            r2.<init>(r1, r0)     // Catch: X.C872730YLn -> L85
            r2.LJIJJ()     // Catch: X.C872730YLn -> L85
            X.0Ztd r1 = new X.0Ztd     // Catch: X.C872730YLn -> L85
            r0 = 22
            r1.<init>(r2, r0)     // Catch: X.C872730YLn -> L85
            r3.LJJJJZI(r7, r1)     // Catch: X.C872730YLn -> L85
            java.lang.Object r2 = r2.LJIJ()     // Catch: X.C872730YLn -> L85
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: X.C872730YLn -> L85
            if (r2 != r0) goto L6c
            X.C099Q.LIZJ(r5)     // Catch: X.C872730YLn -> L85
        L6c:
            if (r2 != r4) goto L6f
            return r4
        L6f:
            if (r2 != 0) goto L80
            X.0YPY r3 = new X.0YPY     // Catch: X.C872730YLn -> L85
            java.lang.String r2 = "createSingleConversationWithTemp returned null"
            r1 = 0
            r0 = -1046(0xfffffffffffffbea, float:NaN)
            r3.<init>(r0, r2, r1, r1)     // Catch: X.C872730YLn -> L85
            X.0Y6Q r0 = X.C865670Xxd.LIZIZ(r3)     // Catch: X.C872730YLn -> L85
            return r0
        L80:
            X.0Y6Q r0 = X.C865670Xxd.LIZJ(r2)     // Catch: X.C872730YLn -> L85
            return r0
        L85:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.0Y6i r3 = r6.LIZLLL()
            java.lang.String r2 = "conversation creation by uid failed, ABORT"
            java.lang.String r1 = "PrepareLocalMessageForSend"
            r0 = 0
            r3.LJIIIIZZ(r1, r2, r0)
            X.0YMW r1 = r4.getError()
            if (r1 == 0) goto La9
            X.0YPP r0 = X.C0YPQ.Companion
            r0.getClass()
            X.0YPR r0 = X.C0YPP.LIZIZ(r1)
        La4:
            X.0Y6Q r0 = X.C865670Xxd.LIZIZ(r0)
            return r0
        La9:
            X.0YPP r0 = X.C0YPQ.Companion
            r0.getClass()
            X.0YPQ r0 = X.C0YPP.LIZ(r4)
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873550YOr.LIZIZ(X.0YEM, long, X.05Vn):java.lang.Object");
    }

    public static final C869590Y9l LIZJ(C0YEM c0yem, InterfaceC873710YPh interfaceC873710YPh, C0Y8T c0y8t, C869590Y9l c869590Y9l) throws C0YPY {
        ArrayList arrayList = null;
        if (interfaceC873710YPh instanceof C0YP4) {
            C868780Y6i.LJ(c0yem.LIZLLL(), "PrepareLocalMessageForSend", "build new message", 4);
            C0YP4 c0yp4 = (C0YP4) interfaceC873710YPh;
            C0YP2 c0yp2 = c0yp4.LIZ;
            C869680Y9u c869680Y9u = new C869680Y9u(c0yem.getUid(), null);
            c869680Y9u.conversation(c0y8t);
            c869680Y9u.msgType(c0yp2.LIZIZ);
            c869680Y9u.scene(c0yp2.LIZLLL);
            c869680Y9u.source(c0yp2.LJ);
            c869680Y9u.toStringPrivacyFilter(c0yp4.LIZLLL);
            C869590Y9l c869590Y9lBuild = c869680Y9u.build();
            c869590Y9lBuild.setUuid(c0yp4.LIZIZ);
            C0I25 c0i25 = c0yp2.LIZJ;
            if (c0i25 instanceof C460190I2v) {
                c869590Y9lBuild.setContentPB(((C460190I2v) c0i25).LIZ);
            } else if (c0i25 instanceof C459930I1v) {
                c869590Y9lBuild.setContent(((C459930I1v) c0i25).LIZ);
            } else {
                throw new C1954807lC();
            }
            Map<String, String> map = c0yp2.LJFF;
            if (map != null) {
                c869590Y9lBuild.putExt(map);
            }
            Map<String, String> map2 = c0yp2.LJI;
            if (map2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                c869590Y9lBuild.putLocalExt(linkedHashMap);
            }
            List<InterfaceC1265204xG> list = c0yp2.LJIIL;
            if (list != null && (!list.isEmpty())) {
                c869590Y9lBuild.addExt("a:mentioned_uids", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS229S0000000_2.get$arr$(935), 30));
            }
            List<Long> list2 = c0yp2.LJIILIIL;
            if (list2 != null && (!list2.isEmpty())) {
                c869590Y9lBuild.addLocalExt("s:visible", C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
            }
            ByteString byteString = c0yp2.LJII;
            if (byteString != null) {
                c869590Y9lBuild.setPersistentExtra(byteString);
            }
            ByteString byteString2 = c0yp2.LJIIIIZZ;
            if (byteString2 != null) {
                c869590Y9lBuild.setTransientExt(byteString2);
            }
            SparseArray<Object> sparseArray = c0yp2.LJIIIZ;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    c869590Y9lBuild.putLocalCache(sparseArray.keyAt(i), sparseArray.valueAt(i));
                }
            }
            c869590Y9lBuild.putLocalCache(2001, Long.valueOf(System.currentTimeMillis()));
            ReferenceInfo referenceInfo = c0yp2.LJIIJJI;
            if (referenceInfo != null) {
                c869590Y9lBuild.setRefMsg(referenceInfo);
            }
            c869590Y9lBuild.setReadStatus(1);
            List<C0YC6> list3 = c0yp2.LJIIJ;
            if (list3 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                for (C0YC6 c0yc6 : list3) {
                    arrayList.add(c0yc6.copy(c869590Y9lBuild.getUuid(), c0yc6.localPath, c0yc6.remoteUrl, c0yc6.length, c0yc6.type, c0yc6.index, c0yc6.ext, c0yc6.status, c0yc6.hash, c0yc6.displayType, c0yc6.mimeType, c0yc6.uploadUri, c0yc6.mediaType, c0yc6.mediaUrlStruct, c0yc6.duration, c0yc6.codec));
                }
            }
            c869590Y9lBuild.setAttachments(arrayList);
            return c869590Y9lBuild;
        }
        if (interfaceC873710YPh instanceof C0YPW) {
            C868780Y6i.LJ(c0yem.LIZLLL(), "PrepareLocalMessageForSend", "reuse existing message", 4);
            C869590Y9l c869590Y9l2 = ((C0YPW) interfaceC873710YPh).LIZ;
            c869590Y9l2.setMsgStatus(0);
            return c869590Y9l2;
        }
        if (interfaceC873710YPh instanceof C1168904hj) {
            C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("retry by uuid: ");
            interfaceC873710YPh.getClass();
            sbLIZ.append((String) null);
            C868780Y6i.LJ(c868780Y6iLIZLLL, "PrepareLocalMessageForSend", C2188811AlT.LIZIZ(sbLIZ), 4);
            if (c869590Y9l != null) {
                c869590Y9l.setMsgStatus(0);
                return c869590Y9l;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Message not found for uuid: ");
            sbLIZ2.append((String) null);
            throw new C0YPY(-1047, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:106:0x0247, B:79:0x01ef], limit reached: 179 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0293 A[Catch: Exception -> 0x02b7, CancellationException -> 0x038b, TryCatch #2 {CancellationException -> 0x038b, blocks: (B:18:0x0074, B:117:0x028d, B:114:0x026d, B:119:0x0293, B:121:0x0297, B:123:0x02b1, B:124:0x02b6), top: B:174:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0368 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0291 -> B:110:0x0259). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x02b7 -> B:128:0x02ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJ(X.C0YEM r21, X.C0YPM r22, X.C0YOY r23, X.InterfaceC1364105Vn<? super X.C0Y6Q<X.C0YPV>> r24) {
        /*
            Method dump skipped, instruction units count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873550YOr.LJ(X.0YEM, X.0YPM, X.0YOY, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[Catch: 0YLn -> 0x00b0, 094W -> 0x00d4, TRY_ENTER, TryCatch #1 {0YLn -> 0x00b0, blocks: (B:17:0x0040, B:34:0x009c, B:36:0x00ab, B:30:0x0087), top: B:74:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab A[Catch: 0YLn -> 0x00b0, 094W -> 0x00d4, TryCatch #1 {0YLn -> 0x00b0, blocks: (B:17:0x0040, B:34:0x009c, B:36:0x00ab, B:30:0x0087), top: B:74:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126 A[Catch: 0YLn -> 0x013c, TRY_ENTER, TryCatch #5 {0YLn -> 0x013c, blocks: (B:13:0x0031, B:56:0x0126, B:58:0x0135), top: B:80:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135 A[Catch: 0YLn -> 0x013c, TryCatch #5 {0YLn -> 0x013c, blocks: (B:13:0x0031, B:56:0x0126, B:58:0x0135), top: B:80:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJFF(X.C0YEM r14, java.lang.String r15, X.C0Y8T r16, X.InterfaceC1364105Vn<? super X.C0Y6Q<X.C0Y8T>> r17) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873550YOr.LJFF(X.0YEM, java.lang.String, X.0Y8T, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJI(X.C0YEM r9, X.C0YPM r10, X.C869590Y9l r11, X.InterfaceC1364105Vn<? super X.C0YPQ> r12) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873550YOr.LJI(X.0YEM, X.0YPM, X.0Y9l, X.05Vn):java.lang.Object");
    }
}
