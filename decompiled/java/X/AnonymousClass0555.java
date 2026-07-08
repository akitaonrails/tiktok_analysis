package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0555, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AnonymousClass0555<T> {
    public static final C01GW<AnonymousClass0552> LIZIZ = C452501pT.LIZIZ(new AnonymousClass0554());
    public boolean LIZ;

    public abstract T LIZIZ();

    public abstract String LIZJ();

    public abstract String LIZLLL();

    public abstract T LJ();

    public abstract C19719912Dl LJI();

    public abstract void LJII(AnonymousClass0556 anonymousClass0556);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.String] */
    public final T LJFF() {
        String strLIZJ = LIZJ();
        T tLIZIZ = LIZIZ();
        C19719912Dl c19719912DlLJI = LJI();
        Keva kevaLIZ = C12922053w.LIZ();
        if (Intrinsics.LJFF(c19719912DlLJI, C13LE.LIZ(Integer.TYPE))) {
            return (T) Integer.valueOf(kevaLIZ.getInt(strLIZJ, ((Integer) tLIZIZ).intValue()));
        }
        if (Intrinsics.LJFF(c19719912DlLJI, C13LE.LIZ(Boolean.TYPE))) {
            return (T) Boolean.valueOf(kevaLIZ.getBoolean(strLIZJ, ((Boolean) tLIZIZ).booleanValue()));
        }
        if (Intrinsics.LJFF(c19719912DlLJI, C13LE.LIZ(String.class))) {
            ?? r3 = (T) ((String) tLIZIZ);
            T t = (T) kevaLIZ.getString(strLIZJ, r3);
            return t == null ? r3 : t;
        }
        if (Intrinsics.LJFF(c19719912DlLJI, C13LE.LIZ(Float.TYPE))) {
            return (T) Float.valueOf(kevaLIZ.getFloat(strLIZJ, ((Float) tLIZIZ).floatValue()));
        }
        if (Intrinsics.LJFF(c19719912DlLJI, C13LE.LIZ(Long.TYPE))) {
            return (T) Long.valueOf(kevaLIZ.getLong(strLIZJ, ((Long) tLIZIZ).longValue()));
        }
        String string = kevaLIZ.getString(strLIZJ, null);
        if (string == null || string.length() == 0) {
            return tLIZIZ;
        }
        try {
            T t2 = (T) C051M.LIZIZ(C09R7.LIZ(c19719912DlLJI), string);
            return t2 == null ? tLIZIZ : t2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to parse json for key ");
            sbLIZ.append(strLIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            return tLIZIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0556] */
    public static Object LIZ(final AnonymousClass0555 anonymousClass0555) {
        anonymousClass0555.getClass();
        C01GW<AnonymousClass0552> c01gw = LIZIZ;
        AnonymousClass0552 value = c01gw.getValue();
        Object obj = value.LIZ().get(anonymousClass0555.LIZJ());
        if (obj != null && anonymousClass0555.LJI().LIZIZ(obj)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anonymousClass0555.LIZLLL());
            sbLIZ.append(" Use Memory Cache value = ");
            sbLIZ.append(obj);
            C2188811AlT.LIZIZ(sbLIZ);
            return obj;
        }
        Object objLJFF = anonymousClass0555.LJFF();
        if (!anonymousClass0555.LIZ) {
            Object objLJ = anonymousClass0555.LJ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(anonymousClass0555.LIZLLL());
            sbLIZ2.append(" onInit, ABManager value = ");
            sbLIZ2.append(objLJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C12922053w.LIZIZ(objLJ, anonymousClass0555.LIZJ());
            anonymousClass0555.LJII(new InterfaceC304970BxP(anonymousClass0555) { // from class: X.0556
                public final /* synthetic */ AnonymousClass0555<Object> LL;

                {
                    this.LL = anonymousClass0555;
                }

                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    Object objLJ2 = this.LL.LJ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(this.LL.LIZLLL());
                    sbLIZ3.append(" callback, newValue = ");
                    sbLIZ3.append(objLJ2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C12922053w.LIZIZ(objLJ2, this.LL.LIZJ());
                    Keva kevaLIZ = C12922053w.LIZ();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("has_ever_callback_new_value_for_exp:");
                    sbLIZ4.append(this.LL.LIZJ());
                    kevaLIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ4), true);
                }
            });
            anonymousClass0555.LIZ = true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(anonymousClass0555.LIZLLL());
        sbLIZ3.append(" Use Disk Cache/First Init value = ");
        sbLIZ3.append(objLJFF);
        C2188811AlT.LIZIZ(sbLIZ3);
        AnonymousClass0552 value2 = c01gw.getValue();
        value2.LIZ().put(anonymousClass0555.LIZJ(), objLJFF);
        return objLJFF;
    }
}
