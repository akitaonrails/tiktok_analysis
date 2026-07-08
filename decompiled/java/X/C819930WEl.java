package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0WEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819930WEl implements InterfaceC820060WEy<C819930WEl> {
    public static final C819920WEk LJ = new C0WF0() { // from class: X.0WEk
        @Override // X.C0WF8
        public final void LIZ(Object obj, C0WF5 c0wf5) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Couldn't find encoder for type ");
            sbLIZ.append(obj.getClass().getCanonicalName());
            throw new C820040WEw(C2188811AlT.LIZIZ(sbLIZ));
        }
    };
    public static final C0WF6 LJFF = new C0WF4() { // from class: X.0WF6
        @Override // X.C0WF8
        public final void LIZ(Object obj, C0WF9 c0wf9) {
            c0wf9.LIZJ((String) obj);
        }
    };
    public static final C820070WEz LJI = new C0WF4() { // from class: X.0WEz
        @Override // X.C0WF8
        public final void LIZ(Object obj, C0WF9 c0wf9) {
            c0wf9.LIZ(((Boolean) obj).booleanValue());
        }
    };
    public static final C819980WEq LJII = new C0WF4<Date>() { // from class: X.0WEq
        public static final DateFormat LIZ;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            LIZ = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // X.C0WF8
        public final void LIZ(Object obj, C0WF9 c0wf9) {
            c0wf9.LIZJ(LIZ.format((Date) obj));
        }
    };
    public final Map<Class<?>, C0WF0<?>> LIZ;
    public final Map<Class<?>, C0WF4<?>> LIZIZ;
    public final C819920WEk LIZJ;
    public boolean LIZLLL;

    public C819930WEl() {
        HashMap map = new HashMap();
        this.LIZ = map;
        HashMap map2 = new HashMap();
        this.LIZIZ = map2;
        this.LIZJ = LJ;
        this.LIZLLL = false;
        map2.put(String.class, LJFF);
        map.remove(String.class);
        map2.put(Boolean.class, LJI);
        map.remove(Boolean.class);
        map2.put(Date.class, LJII);
        map.remove(Date.class);
    }

    @Override // X.InterfaceC820060WEy
    public final InterfaceC820060WEy LIZ(Class cls, C0WF0 c0wf0) {
        ((HashMap) this.LIZ).put(cls, c0wf0);
        ((HashMap) this.LIZIZ).remove(cls);
        return this;
    }
}
