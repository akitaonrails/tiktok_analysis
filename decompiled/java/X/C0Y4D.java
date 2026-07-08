package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.SendMessageResponseBody;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Y4D, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y4D {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final InterfaceC864330XvT LIZ;
    public final C0YEM LIZIZ;
    public final C867480Y1i LIZJ;
    public final InterfaceC863850Xuh LIZLLL;
    public final C0Y4I LJ;
    public final C0D2S<SendMessageResponseBody> LJFF;
    public final AbstractC2252651DEx LJI;
    public final Function0<AbstractC2252651DEx> LJII;
    public final int LJIIIIZZ;

    public C0Y4D() {
        throw null;
    }

    public static C864440Xve LJFF(String str) {
        C0YMW c0ymw = C0YMW.newBuilder().LIZ;
        c0ymw.code = -1015;
        c0ymw.statusMsg = str;
        return new C864440Xve(c0ymw, (C867350Y0v) null, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.bytedance.im.core.proto.Request r14, X.InterfaceC1364105Vn<? super X.C0Y4J> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C862760Xsw
            if (r0 == 0) goto L22
            r4 = r15
            X.0Xsw r4 = (X.C862760Xsw) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r8 = 0
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            goto L58
        L22:
            X.0Xsw r4 = new X.0Xsw
            r4.<init>(r13, r15)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.0YEM r0 = r13.LIZIZ
            X.0YEf r0 = r0.LJIIIZ()
            boolean r0 = r0.LJJJJJ
            r0 = r0 ^ 1
            X.0XvT r1 = r13.LIZ     // Catch: X.C0Y8K -> L61
            X.0YCX r6 = new X.0YCX     // Catch: X.C0Y8K -> L61
            r10 = 0
            r12 = 510(0x1fe, float:7.15E-43)
            r7 = r14
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r12)     // Catch: X.C0Y8K -> L61
            if (r0 == 0) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r4.LLILLL = r2     // Catch: X.C0Y8K -> L61
            java.lang.Object r1 = r1.LLLIILIL(r6, r0, r4)     // Catch: X.C0Y8K -> L61
            if (r1 != r5) goto L5b
            return r5
        L58:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C0Y8K -> L61
        L5b:
            X.0XwA r1 = (X.C864760XwA) r1     // Catch: X.C0Y8K -> L61
            com.bytedance.im.core.proto.Response r4 = r1.LIZ     // Catch: X.C0Y8K -> L61
            r2 = r3
            goto L8d
        L61:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.0YEM r0 = r13.LIZIZ
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.String r1 = "TAG_CreateConversationUseCase"
            java.lang.String r0 = "create conversation error"
            r2.LJIIIIZZ(r1, r0, r4)
            X.0YMX r2 = X.C0YMW.newBuilder()
            int r1 = r4.getErrorCode()
            X.0YMW r0 = r2.LIZ
            r0.code = r1
            java.lang.String r0 = r4.getMessage()
            X.0YMW r2 = r2.LIZ
            r2.statusMsg = r0
            r2.throwable = r4
            boolean r8 = r4.isRecoverableFailure()
            r4 = r3
        L8d:
            X.0Y4J r1 = new X.0Y4J
            if (r4 == 0) goto L9f
            com.bytedance.im.core.proto.ResponseBody r0 = r4.body
            if (r0 == 0) goto L9f
            com.bytedance.im.core.proto.CreateConversationV2ResponseBody r0 = r0.create_conversation_v2_body
        L97:
            if (r4 == 0) goto L9b
            java.lang.String r3 = r4.log_id
        L9b:
            r1.<init>(r0, r2, r3, r8)
            return r1
        L9f:
            r0 = r3
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y4D.LJ(com.bytedance.im.core.proto.Request, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r12, X.InterfaceC1364105Vn<? super java.util.List<? extends X.C189200o6<? extends X.C869590Y9l>>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y4D.LJII(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(long r21, java.lang.String r23, X.InterfaceC1364105Vn<? super java.lang.Boolean> r24) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y4D.LJIIIIZZ(long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r17, com.bytedance.im.core.proto.Request r18, X.InterfaceC1364105Vn<? super X.C864440Xve> r19) throws java.lang.Throwable {
        /*
            r16 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C862740Xsu
            r8 = r16
            if (r0 == 0) goto L9c
            r15 = r3
            X.0Xsu r15 = (X.C862740Xsu) r15
            int r2 = r15.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r15.LLILLL = r2
        L16:
            java.lang.Object r1 = r15.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto La3
            X.C155000ia.LIZIZ(r1)
        L26:
            return r1
        L27:
            X.C155000ia.LIZIZ(r1)
            r11 = r18
            com.bytedance.im.core.proto.RequestBody r0 = r11.body
            com.bytedance.im.core.proto.CreateConversationV2RequestBody r0 = r0.create_conversation_v2_body
            r3 = 0
            if (r0 == 0) goto L42
            java.lang.Long r12 = r0.conversation_short_id
            java.lang.Integer r7 = r0.conversation_type
        L37:
            java.lang.Integer r6 = r11.inbox_type
            if (r12 != 0) goto L45
            java.lang.String r0 = "null short id"
            X.0Xve r0 = LJFF(r0)
            return r0
        L42:
            r12 = r3
            r7 = r3
            goto L37
        L45:
            if (r7 != 0) goto L4e
            java.lang.String r0 = "invalid conv type"
            X.0Xve r0 = LJFF(r0)
            return r0
        L4e:
            if (r6 != 0) goto L57
            java.lang.String r0 = "invalid inbox type"
            X.0Xve r0 = LJFF(r0)
            return r0
        L57:
            long r0 = r12.longValue()
            X.0YEM r2 = r8.LIZIZ
            X.0XwD r2 = r2.LJIIZILJ()
            X.0Y5R r2 = r2.LIZIZ()
            X.0Y9J r2 = r2.LIZIZ()
            X.0Y8e r2 = r2.LJIIJJI()
            boolean r0 = r2.LJJIJ(r0)
            if (r0 != 0) goto L88
            X.0Xve r2 = new X.0Xve
            X.0YMX r0 = X.C0YMW.newBuilder()
            X.0YMW r1 = r0.LIZ
            r0 = -1017(0xfffffffffffffc07, float:NaN)
            r1.code = r0
            java.lang.String r0 = "conv is deleted"
            r1.statusMsg = r0
            r0 = 5
            r2.<init>(r1, r3, r0)
            return r2
        L88:
            int r9 = r7.intValue()
            int r10 = r6.intValue()
            r13 = 1
            r15.LLILLL = r4
            r14 = r17
            java.lang.Object r1 = r8.LJIIJ(r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r5) goto L26
            return r5
        L9c:
            X.0Xsu r15 = new X.0Xsu
            r15.<init>(r8, r3)
            goto L16
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y4D.LJIIIZ(java.lang.String, com.bytedance.im.core.proto.Request, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r22, long r23, X.InterfaceC863600XuI<X.C0Y8T> r25, X.InterfaceC1364105Vn<? super X.C864440Xve> r26) {
        /*
            r21 = this;
            r3 = r26
            r5 = r25
            boolean r0 = r3 instanceof X.C862730Xst
            r9 = r21
            if (r0 == 0) goto L2e
            r4 = r3
            X.0Xst r4 = (X.C862730Xst) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r4.LLILZ = r2
        L18:
            java.lang.Object r8 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L3c
            if (r0 == r7) goto L77
            if (r0 != r6) goto L34
            java.lang.Object r0 = r4.LL
            X.C155000ia.LIZIZ(r8)
            return r0
        L2e:
            X.0Xst r4 = new X.0Xst
            r4.<init>(r9, r3)
            goto L18
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3c:
            X.C155000ia.LIZIZ(r8)
            java.lang.Long[] r2 = new java.lang.Long[r6]
            X.0YEM r0 = r9.LIZIZ
            long r0 = r0.getUid()
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.Long r0 = X.C2286608xc.LJFF(r23)
            r2[r7] = r0
            java.util.List r12 = X.C1697810uHb.LJIIJJI(r2)
            int r11 = X.AbstractC1711506n3.LIZ
            r4.LL = r5
            r4.LLILZ = r7
            java.util.Map r14 = X.C2097608Jq.LJ()
            r13 = 0
            r10 = r22
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r4
            java.lang.Object r8 = r9.LIZIZ(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r8 != r3) goto L7e
            return r3
        L77:
            java.lang.Object r5 = r4.LL
            X.0XuI r5 = (X.InterfaceC863600XuI) r5
            X.C155000ia.LIZIZ(r8)
        L7e:
            X.0Xve r8 = (X.C864440Xve) r8
            r4.LL = r8
            r4.LLILZ = r6
            if (r5 == 0) goto L9d
            X.1DEx r2 = r9.LJI
            X.0XuD r1 = new X.0XuD
            r0 = 0
            r1.<init>(r8, r5, r0)
            java.lang.Object r1 = X.C23250099c.LJI(r4, r2, r1)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L9a
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L9a:
            if (r1 != r3) goto La0
            return r3
        L9d:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L9a
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y4D.LIZLLL(int, long, X.0XuI, X.05Vn):java.lang.Object");
    }

    public C0Y4D(InterfaceC864330XvT interfaceC864330XvT, C0YEM c0yem, C867480Y1i c867480Y1i, InterfaceC863850Xuh interfaceC863850Xuh, C0Y4I c0y4i, C0D2S c0d2s) {
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c0yem, 21);
        this.LIZ = interfaceC864330XvT;
        this.LIZIZ = c0yem;
        this.LIZJ = c867480Y1i;
        this.LIZLLL = interfaceC863850Xuh;
        this.LJ = c0y4i;
        this.LJFF = c0d2s;
        this.LJI = abstractC2238408pq;
        this.LJII = awS558S0100000_14;
        this.LJIIIIZZ = C0YMR.CREATE_CONVERSATION_V2.getValue();
    }

    public final void LIZ(C0YJ9 c0yj9, String str, Long l, Integer num, boolean z, C0YMW c0ymw) {
        String str2;
        long jLongValue;
        int iIntValue;
        Map<Long, C0Y44> map;
        C0Y44 c0y44;
        int i;
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0yj9.LIZ(str2, "is_retry");
        c0yj9.LIZ(String.valueOf(str), Scene.SCENE_SERVICE);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        c0yj9.LIZ(Long.valueOf(jLongValue), "conversation_short_id");
        int code = -1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c0yj9.LIZ(Integer.valueOf(iIntValue), "conversation_type");
        String statusMsg = null;
        if (c0ymw != null) {
            statusMsg = c0ymw.getStatusMsg();
        }
        c0yj9.LIZ(String.valueOf(statusMsg), "status_msg");
        if (c0ymw != null) {
            code = c0ymw.getCode();
        }
        c0yj9.LIZ(Integer.valueOf(code), "error_code");
        if (l != null) {
            long jLongValue2 = l.longValue();
            C0Y45 c0y45LIZJ = this.LIZIZ.LJIIZILJ().LIZLLL().LJII().LIZJ();
            if (c0y45LIZJ != null && (map = c0y45LIZJ.LIZ) != null && (c0y44 = map.get(Long.valueOf(jLongValue2))) != null) {
                long j = c0y44.LIZLLL;
                if (j > 0) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date(j));
                    calendar.set(11, 23);
                    calendar.set(13, 59);
                    calendar.set(12, 59);
                    calendar.set(14, 999);
                    long timeInMillis = calendar.getTimeInMillis();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = jCurrentTimeMillis - j;
                    long j3 = jCurrentTimeMillis - timeInMillis;
                    long millis = TimeUnit.DAYS.toMillis(1L);
                    if (j3 <= 0) {
                        i = 0;
                    } else {
                        i = ((int) (j3 / millis)) + 1;
                    }
                    c0yj9.LIZ(String.valueOf(i), "days_from_group_fake_write");
                    c0yj9.LIZ(String.valueOf(j2), "duration_from_group_fake_write");
                }
            }
        }
    }

    public final void LJI(C0Y4H c0y4h, C867350Y0v c867350Y0v, C0YMW c0ymw, Integer num, Long l, boolean z, String str) {
        long j;
        if (c0y4h != null) {
            c0y4h.LJIIJ = SystemClock.uptimeMillis() - c0y4h.LIZ;
        }
        C0YJ9 c0yj9 = new C0YJ9(this.LIZIZ);
        c0yj9.LIZJ("imsdk_create_conversation");
        long j2 = -1;
        if (c0y4h != null) {
            j = c0y4h.LIZLLL;
        } else {
            j = -1;
        }
        c0yj9.LIZ(Long.valueOf(j), "network_time");
        if (c0y4h != null) {
            j2 = c0y4h.LJIIJ;
        }
        c0yj9.LIZ(Long.valueOf(j2), "whole_time");
        c0yj9.LIZ("1", "is_success");
        LIZ(c0yj9, str, l, num, z, c0ymw);
        c0yj9.LIZLLL();
        if (c867350Y0v != null) {
            c867350Y0v.LIZJ = SystemClock.elapsedRealtime();
            c867350Y0v.LIZLLL = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0324 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0378  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(int r27, int r28, com.bytedance.im.core.proto.Request r29, java.lang.Long r30, boolean r31, java.lang.String r32, X.InterfaceC1364105Vn<? super X.C864440Xve> r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y4D.LJIIJ(int, int, com.bytedance.im.core.proto.Request, java.lang.Long, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object LIZIZ(int i, int i2, List list, String str, Map map, String str2, String str3, String str4, String str5, Long l, AbstractC23140094w abstractC23140094w) {
        boolean z;
        Long l2;
        String string = str;
        C868780Y6i.LJIILJJIL(this.LIZIZ.LIZLLL(), "TAG_CreateConversationUseCase", "create group start", 4);
        boolean z2 = false;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).longValue() <= 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        String str6 = null;
        Object[] objArr = 0;
        if (z) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.code = -1015;
            return new C864440Xve(c0ymw, (C867350Y0v) (objArr == true ? 1 : 0), 5);
        }
        C0YEM c0yem = this.LIZIZ;
        C0Y4R c0y4r = new C0Y4R();
        c0y4r.LIZLLL = Integer.valueOf(i2);
        C1516540pZE.LIZ(list);
        c0y4r.LJ = list;
        C1516540pZE.LIZIZ(map);
        c0y4r.LJIIJ = map;
        if (str2 != null && str2.length() > 0) {
            c0y4r.LJIIJJI = str2;
        }
        if (str3 != null && str3.length() > 0) {
            c0y4r.LJIIL = str3;
        }
        if (str4 != null && str4.length() > 0) {
            c0y4r.LJII = str4;
        }
        if (str5 != null && str5.length() > 0) {
            c0y4r.LJIIIZ = str5;
        }
        if (l != null) {
            c0y4r.LJIILL = Long.valueOf(l.longValue());
        }
        if (i2 != AbstractC1711506n3.LIZ) {
            if (string == null || string.length() == 0) {
                z2 = true;
            }
            boolean z3 = !z2;
            if (!z3) {
                string = UUID.randomUUID().toString();
            }
            c0y4r.LJFF = Boolean.valueOf(z3);
            c0y4r.LJI = string;
        }
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJIL = c0y4r.build();
        Request requestLIZ = C0YLX.LIZ(i, C0YMR.CREATE_CONVERSATION_V2.getValue(), c1es0.build(), c0yem.LJ(), c0yem.LJIIIZ(), null);
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sb = new StringBuilder("build request: cid=");
        CreateConversationV2RequestBody createConversationV2RequestBody = requestLIZ.body.create_conversation_v2_body;
        if (createConversationV2RequestBody != null) {
            l2 = createConversationV2RequestBody.conversation_short_id;
        } else {
            l2 = null;
        }
        sb.append(l2);
        sb.append(", name=");
        CreateConversationV2RequestBody createConversationV2RequestBody2 = requestLIZ.body.create_conversation_v2_body;
        if (createConversationV2RequestBody2 != null) {
            str6 = createConversationV2RequestBody2.name;
        }
        sb.append(str6);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "TAG_CreateConversationUseCase", sb.toString(), 4);
        if (l != null) {
            return this.LIZLLL.LIZIZ(l.toString(), this.LJIIIIZZ, requestLIZ, new C862710Xsr(this, i2, i, requestLIZ, l, null), abstractC23140094w);
        }
        return LJIIJ(i2, i, requestLIZ, l, false, null, abstractC23140094w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0454 A[PHI: r9
      0x0454: PHI (r9v3 X.0Y44) = (r9v2 X.0Y44), (r9v10 X.0Y44) binds: [B:119:0x044f, B:31:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v131, types: [X.0Y8T] */
    /* JADX WARN: Type inference failed for: r1v157, types: [X.0Y4D] */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r21v2, types: [X.0Y4D] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r31v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r34, java.util.List<java.lang.Long> r35, java.lang.String r36, java.util.Map<java.lang.String, java.lang.String> r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.Boolean r43, X.InterfaceC863580XuG r44, X.InterfaceC1364105Vn<? super X.C864440Xve> r45) {
        /*
            Method dump skipped, instruction units count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Y4D.LIZJ(int, java.util.List, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, X.0XuG, X.05Vn):java.lang.Object");
    }
}
