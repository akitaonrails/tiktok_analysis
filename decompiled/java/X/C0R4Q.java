package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AdapterControlAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0R4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4Q extends C09AY implements InterfaceC1631630sYr {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(6);
    public final int $t;

    public static C0R4Q get$arr$(int i) {
        C0R4Q c0r4q = (C0R4Q) arr$.get(i);
        if (c0r4q != null) {
            return c0r4q;
        }
        arr$.compareAndSet(i, null, new C0R4Q(i));
        return (C0R4Q) arr$.get(i);
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R4Q(int i) {
        super(4);
        this.$t = i;
    }

    public static final Object invoke$0(C0R4Q c0r4q, Object obj, Object obj2, Object obj3, Object obj4) {
        String strOptString;
        String strOptString2;
        String str;
        String str2 = (String) obj;
        JSONObject jSONObject = (JSONObject) obj3;
        Map map = (Map) obj4;
        C663620Q1g c663620Q1g = C663620Q1g.LIZ;
        C0QRW c0qrw = ((C0QRQ) obj2).LIZJ;
        c663620Q1g.getClass();
        if (C0BYB.LIZ()) {
            C311300CIe.LIZ.getClass();
            if (C0QRL.LIZ(C311300CIe.LIZ())) {
                String str3 = "";
                if ((map == null || (strOptString = (String) map.get("enter_from")) == null) && (jSONObject == null || (strOptString = jSONObject.optString("enter_from")) == null)) {
                    strOptString = "";
                }
                Locale locale = Locale.ROOT;
                String lowerCase = strOptString.toLowerCase(locale);
                if (map != null && (str = (String) map.get("search_type")) != null) {
                    str3 = str;
                } else if (jSONObject != null && (strOptString2 = jSONObject.optString("search_type")) != null) {
                    str3 = strOptString2;
                }
                String lowerCase2 = str3.toLowerCase(locale);
                if (C1697810uHb.LJIIJJI("visual_search", "photo_search").contains(lowerCase) || Intrinsics.LJFF(lowerCase2, "visual") || c0qrw == C0QRW.VISUAL_SEARCH) {
                    Iterator it2 = ((List) C663620Q1g.LIZJ.getValue()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InterfaceC663630Q1h interfaceC663630Q1h = (InterfaceC663630Q1h) it2.next();
                        if (interfaceC663630Q1h.m3(str2)) {
                            interfaceC663630Q1h.n3(jSONObject, map);
                            break;
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C0R4Q c0r4q, Object obj, Object obj2, Object obj3, Object obj4) {
        C655330Pn9 c655330Pn9 = (C655330Pn9) obj2;
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) obj), SearchServiceCenter$AdapterControlAbility.class, null);
        if (searchServiceCenter$AdapterControlAbility != null) {
            searchServiceCenter$AdapterControlAbility.vb(c655330Pn9.LL, C0PL1.FEEDBACK_CARD);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C0R4Q c0r4q, Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        CharSequence charSequence = (CharSequence) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Map map = (Map) obj3;
        if (((Boolean) obj4).booleanValue()) {
            C21432318u9.LIZ.getClass();
            return C21432318u9.LIZ(charSequence, map);
        }
        Object obj6 = null;
        if (map != null) {
            obj5 = map.get("tako_link_sup_style");
        } else {
            obj5 = null;
        }
        if (obj5 instanceof Boolean) {
            obj6 = obj5;
        }
        if (Intrinsics.LJFF(obj6, Boolean.TRUE)) {
            float fLIZIZ = C418440Gaw.LIZIZ(9);
            C689240R1u.LIZ.getClass();
            ((Number) C689240R1u.LJIJI.invoke()).intValue();
            return new C445280Hd8(fLIZIZ, ((Number) C689240R1u.LJIJJLI.invoke()).intValue(), C689240R1u.LJI(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), charSequence, (Bitmap) C689240R1u.LJIIIZ.invoke(Integer.valueOf(R.raw.icon_link_fill), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)))), 0.8181818f);
        }
        if (zBooleanValue) {
            float fLIZIZ2 = C418440Gaw.LIZIZ(8);
            C689240R1u.LIZ.getClass();
            return new C445280Hd8(fLIZIZ2, ((Number) C689240R1u.LJIJI.invoke()).intValue(), ((Number) C689240R1u.LJIJJLI.invoke()).intValue(), C689240R1u.LJI(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), charSequence, (Bitmap) C689240R1u.LJIIJ.invoke());
        }
        C689240R1u.LIZ.getClass();
        return new C418260Gae(((Number) C689240R1u.LJIJI.invoke()).intValue(), ((Number) C689240R1u.LJIJJLI.invoke()).intValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), charSequence);
    }

    public static final Object invoke$3(C0R4Q c0r4q, Object obj, Object obj2, Object obj3, Object obj4) {
        Activity activityLIZIZ;
        CharSequence charSequence = (CharSequence) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Map map = (Map) obj3;
        if (((Boolean) obj4).booleanValue()) {
            C21432318u9.LIZ.getClass();
            return C21432318u9.LIZ(charSequence, map);
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if (zBooleanValue) {
            float fLIZIZ = C418440Gaw.LIZIZ(8);
            C689240R1u.LIZ.getClass();
            return new C445280Hd8(fLIZIZ, ((Number) C689240R1u.LJIJ.invoke(activityLIZIZ)).intValue(), ((Number) C689240R1u.LJIJJ.invoke(activityLIZIZ)).intValue(), C689240R1u.LJI(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), charSequence, (Bitmap) C689240R1u.LJI.invoke(activityLIZIZ));
        }
        C689240R1u.LIZ.getClass();
        return new C418260Gae(((Number) C689240R1u.LJIJ.invoke(activityLIZIZ)).intValue(), ((Number) C689240R1u.LJIJJ.invoke(activityLIZIZ)).intValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), charSequence);
    }

    public static final Object invoke$4(C0R4Q c0r4q, Object obj, Object obj2, Object obj3, Object obj4) {
        C655710Pnl c655710Pnl = (C655710Pnl) obj2;
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) obj), SearchServiceCenter$AdapterControlAbility.class, null);
        if (searchServiceCenter$AdapterControlAbility != null) {
            searchServiceCenter$AdapterControlAbility.vb(c655710Pnl.LL, C0PL1.FEEDBACK_CARD);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(C0R4Q c0r4q, Object obj, Object obj2, Object obj3, Object obj4) {
        C655710Pnl c655710Pnl = (C655710Pnl) obj2;
        SearchServiceCenter$AdapterControlAbility searchServiceCenter$AdapterControlAbility = (SearchServiceCenter$AdapterControlAbility) C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) obj), SearchServiceCenter$AdapterControlAbility.class, null);
        if (searchServiceCenter$AdapterControlAbility != null) {
            searchServiceCenter$AdapterControlAbility.vb(c655710Pnl.LL, C0PL1.FEEDBACK_CARD);
        }
        return Unit.LIZ;
    }
}
