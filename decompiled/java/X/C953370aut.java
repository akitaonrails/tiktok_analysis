package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS179S1100000_30;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953370aut {
    public static GetUploadAuthResponse.ResponseData LIZ;

    public static boolean LIZIZ(GetUploadAuthResponse.ResponseData responseData) {
        if (responseData.accessKey.length() > 0 && responseData.secretKey.length() > 0 && responseData.sessionToken.length() > 0 && C158B.LIZJ() < responseData.expiredTime) {
            return true;
        }
        return false;
    }

    public static C19482011Jy LIZJ(C917840Zza c917840Zza) {
        final String str = c917840Zza.LIZ;
        C11KS c11ksLJII = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0avt
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                Boolean boolValueOf;
                C11KT c11kt = (C11KT) interfaceC2329309At;
                AwS179S1100000_30 awS179S1100000_30 = new AwS179S1100000_30(c11kt, str, 6);
                GetUploadAuthResponse.ResponseData responseData = C953370aut.LIZ;
                if (responseData != null) {
                    boolValueOf = Boolean.valueOf(C953370aut.LIZIZ(responseData));
                } else {
                    boolValueOf = null;
                }
                if (C176600m4.LIZIZ(boolValueOf)) {
                    awS179S1100000_30.invoke();
                } else {
                    C953370aut.LIZ(new AwS559S0100000_15(awS179S1100000_30, 1037), new AwS594S0100000_15(c11kt, 1029));
                }
            }
        });
        final String str2 = c917840Zza.LIZIZ;
        C11KS c11ksLJII2 = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0avt
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                Boolean boolValueOf;
                C11KT c11kt = (C11KT) interfaceC2329309At;
                AwS179S1100000_30 awS179S1100000_30 = new AwS179S1100000_30(c11kt, str2, 6);
                GetUploadAuthResponse.ResponseData responseData = C953370aut.LIZ;
                if (responseData != null) {
                    boolValueOf = Boolean.valueOf(C953370aut.LIZIZ(responseData));
                } else {
                    boolValueOf = null;
                }
                if (C176600m4.LIZIZ(boolValueOf)) {
                    awS179S1100000_30.invoke();
                } else {
                    C953370aut.LIZ(new AwS559S0100000_15(awS179S1100000_30, 1037), new AwS594S0100000_15(c11kt, 1029));
                }
            }
        });
        final String str3 = c917840Zza.LIZJ;
        AbstractC19484711Kz abstractC19484711KzLJJIZ = AbstractC19484711Kz.LJJIZ(c11ksLJII, c11ksLJII2, AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0avt
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                Boolean boolValueOf;
                C11KT c11kt = (C11KT) interfaceC2329309At;
                AwS179S1100000_30 awS179S1100000_30 = new AwS179S1100000_30(c11kt, str3, 6);
                GetUploadAuthResponse.ResponseData responseData = C953370aut.LIZ;
                if (responseData != null) {
                    boolValueOf = Boolean.valueOf(C953370aut.LIZIZ(responseData));
                } else {
                    boolValueOf = null;
                }
                if (C176600m4.LIZIZ(boolValueOf)) {
                    awS179S1100000_30.invoke();
                } else {
                    C953370aut.LIZ(new AwS559S0100000_15(awS179S1100000_30, 1037), new AwS594S0100000_15(c11kt, 1029));
                }
            }
        }), C952990auH.LIZ);
        final String str4 = c917840Zza.LJ;
        return C953290aul.LIZ(abstractC19484711KzLJJIZ, AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0avt
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                Boolean boolValueOf;
                C11KT c11kt = (C11KT) interfaceC2329309At;
                AwS179S1100000_30 awS179S1100000_30 = new AwS179S1100000_30(c11kt, str4, 6);
                GetUploadAuthResponse.ResponseData responseData = C953370aut.LIZ;
                if (responseData != null) {
                    boolValueOf = Boolean.valueOf(C953370aut.LIZIZ(responseData));
                } else {
                    boolValueOf = null;
                }
                if (C176600m4.LIZIZ(boolValueOf)) {
                    awS179S1100000_30.invoke();
                } else {
                    C953370aut.LIZ(new AwS559S0100000_15(awS179S1100000_30, 1037), new AwS594S0100000_15(c11kt, 1029));
                }
            }
        })).LJIL(new InterfaceC1487280oo2() { // from class: X.0Zzx
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Pair pair = (Pair) obj;
                return new C953270auj((String) ((C443120HZe) pair.getFirst()).getFirst(), (String) ((C443120HZe) pair.getFirst()).getSecond(), (String) ((C443120HZe) pair.getFirst()).getThird(), (String) pair.getSecond());
            }
        });
    }

    public static void LIZ(Function0 function0, Function1 function1) {
        long id;
        Object c098200Yq;
        long jLongValue;
        String strU3;
        GetUploadAuthParams getUploadAuthParams = new GetUploadAuthParams();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        getUploadAuthParams.roomId = id;
        try {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null) {
                c098200Yq = Long.valueOf(CastLongProtector.parseLong(strU3));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            Long l = (Long) c098200Yq;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            getUploadAuthParams.channelId = jLongValue;
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            getUploadAuthParams.channelId = 0L;
        }
        C480460Ism.LIZ().getClass();
        ((INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class)).fetchImageUploadToken(getUploadAuthParams).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(function0, 179), new AfS184S0100000_15(function1, (Function1<? super C470590Icr<Unit>, Unit>) 180));
    }

    public static void LIZLLL(String str, Function2 function2) {
        Boolean boolValueOf;
        String strLIZ = C1017903yT.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C142L c142l = new C142L(jCurrentTimeMillis, str, strLIZ, function2);
        C946850akN.LIZJ.put(strLIZ, Long.valueOf(System.currentTimeMillis()));
        C946850akN.LJIILIIL("livesdk_multi_anchor_noticeboard_pic_upload", C946850akN.LIZJ());
        GetUploadAuthResponse.ResponseData responseData = LIZ;
        if (responseData != null) {
            boolValueOf = Boolean.valueOf(LIZIZ(responseData));
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            C953610avH.LJJI.getClass();
            if (C953610avH.LJJII == null) {
                C952930auB.LIZ(EnumC952940auC.CREATE, EnumC953380auu.FETCH_TOKEN, CardStruct.IStatusCode.DEFAULT, "");
            }
            c142l.invoke();
            return;
        }
        LIZ(new AwS559S0100000_15(c142l, 1036), new C953160auY(jCurrentTimeMillis, strLIZ, function2));
    }
}
