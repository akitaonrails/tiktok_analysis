package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.BagItem;

/* JADX INFO: renamed from: X.0bPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.log.MatchItemAppLogKt$logMatchItemStock$1", f = "MatchItemAppLog.kt", l = {871}, m = "invokeSuspend")
public final class C972440bPe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C973660bRc LLILLJJLI;
    public final /* synthetic */ int[] LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C972440bPe(C973660bRc c973660bRc, int[] iArr, InterfaceC1364105Vn<? super C972440bPe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c973660bRc;
        this.LLILLL = iArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C972440bPe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Long lLJFF;
        String string;
        Long lValueOf;
        long jLongValue;
        Object next;
        boolean z;
        long j;
        Long lLJFF2;
        C1C7U.LIZ("MatchItemAppLogKt@d4e7.logMatchItemStock$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(6000L, this) == objLJFF) {
                C1C7U.LIZIZ("MatchItemAppLogKt@d4e7.logMatchItemStock$1");
                return objLJFF;
            }
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            lLJFF = C2286608xc.LJFF(interfaceC973730bRjYf2.LJJJJJL());
        } else {
            lLJFF = null;
        }
        String strValueOf = String.valueOf(lLJFF);
        try {
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C915980Zwa.LJFF().RY(false) == EnumC964170bCJ.MATCH_START) {
            this.LLILLJJLI.getClass();
            if (C973660bRc.LJLILLLLZI != CastLongProtector.parseLong(strValueOf)) {
                C973660bRc c973660bRc = this.LLILLJJLI;
                long j2 = CastLongProtector.parseLong(strValueOf);
                c973660bRc.getClass();
                C973660bRc.LJLILLLLZI = j2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (Intrinsics.LJFF(strValueOf, CardStruct.IStatusCode.DEFAULT)) {
                    InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(true);
                    if (interfaceC973730bRjYf22 != null) {
                        lLJFF2 = C2286608xc.LJFF(interfaceC973730bRjYf22.LJJJJJL());
                    } else {
                        lLJFF2 = null;
                    }
                    strValueOf = String.valueOf(lLJFF2);
                }
                linkedHashMap.put("pk_id", strValueOf);
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                if (interfaceC500940JkiUser == null || (string = C2286608xc.LJFF(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
                    string = "";
                }
                linkedHashMap.put("user_id", string);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    linkedHashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    linkedHashMap.put("room_id", room.getIdStr());
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (int i2 : this.LLILLL) {
                    EnumC1144450ft5.Companion.getClass();
                    String strValueOf2 = String.valueOf(C1144460ft6.LIZ(i2));
                    List<BagItem> list = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class);
                    long j3 = 0;
                    if (list != null) {
                        long j4 = 0;
                        for (BagItem bagItem : list) {
                            if (bagItem.itemType == i2) {
                                j = bagItem.count;
                            } else {
                                j = 0;
                            }
                            j4 += j;
                        }
                        lValueOf = Long.valueOf(j4);
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    jSONObject.put(strValueOf2, jLongValue);
                    List list2 = (List) DataChannelGlobal.LLILZ.gg0(C1148160fz4.class);
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (((BagItem) next).itemType == i2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        BagItem bagItem2 = (BagItem) next;
                        if (bagItem2 != null) {
                            j3 = bagItem2.count;
                        }
                    }
                    jSONObject2.put(strValueOf2, j3);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("stock_value", jSONObject);
                jSONObject3.put("distinct_stock_value", jSONObject2);
                linkedHashMap.put("match_item", C786410Ut5.J3(jSONObject3));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("match_item_stock");
                c474500IjALIZ.LJJIIZI(linkedHashMap);
                c474500IjALIZ.LIZ();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MatchItemAppLogKt@d4e7.logMatchItemStock$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MatchItemAppLogKt@d4e7.logMatchItemStock$1");
        return unit2;
    }
}
