package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.09Mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.screenshot.ScreenShotEventDispatcher$handleMediaContentChange$1", f = "ScreenShotEventDispatcher.kt", l = {}, m = "invokeSuspend")
public final class C2360709Mv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Uri LLILLJJLI;
    public final /* synthetic */ Long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2360709Mv(Context context, Uri uri, Long l, InterfaceC1364105Vn<? super C2360709Mv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = uri;
        this.LLILLL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2360709Mv(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [T, android.database.Cursor] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Point point;
        C1C7U.LIZ("ScreenShotEventDispatcher@c22a.handleMediaContentChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL;
        if (context == null) {
            C20343314it.LIZ.getClass();
            C20343314it.LIZ("context is null");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ScreenShotEventDispatcher@c22a.handleMediaContentChange$1");
            return unit;
        }
        if (C2360909Mx.LIZJ == null) {
            C2360909Mx.LIZ.getClass();
            try {
                point = new Point();
                try {
                    C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmrcZrL0iHICKT0MS8H9JZZ5eOteBlqNBR0qnoPF1yPs89yDA==", null)).getRealSize(point);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                e = e2;
                point = null;
            }
            C2360909Mx.LIZJ = point;
        }
        C259800zU c259800zU = new C259800zU();
        try {
            c259800zU.element = C2360909Mx.LIZ(C2360909Mx.LIZ, this.LLILLJJLI, this.LL);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        T t = c259800zU.element;
        if (t != 0 && ((Cursor) t).moveToFirst()) {
            T t2 = c259800zU.element;
            Long l = this.LLILLL;
            Cursor cursor = (Cursor) t2;
            int columnIndex = cursor.getColumnIndex("_data");
            int columnIndex2 = cursor.getColumnIndex("date_added");
            int columnIndex3 = cursor.getColumnIndex("width");
            int columnIndex4 = cursor.getColumnIndex("height");
            C2360909Mx c2360909Mx = C2360909Mx.LIZ;
            Cursor cursor2 = (Cursor) c259800zU.element;
            c2360909Mx.getClass();
            String string = cursor2.getString(columnIndex);
            if (string == null) {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                C20343314it.LIZ.getClass();
                C20343314it.LIZ("error: path");
            } else {
                String lowerCase = string.toLowerCase(Locale.getDefault());
                String[] strArr = C2360909Mx.LJIIIIZZ;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (a0.LJJIIZI(lowerCase, strArr[i], false)) {
                        C2360909Mx c2360909Mx2 = C2360909Mx.LIZ;
                        Cursor cursor3 = (Cursor) c259800zU.element;
                        c2360909Mx2.getClass();
                        long j = cursor3.getLong(columnIndex2);
                        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                        Long lLJFF = C2286608xc.LJFF(j * j2);
                        if (lLJFF != null && l != null && lLJFF.longValue() / j2 >= l.longValue() / j2 && System.currentTimeMillis() - lLJFF.longValue() <= 10000) {
                            Cursor cursor4 = (Cursor) c259800zU.element;
                            if (columnIndex3 >= 0 && columnIndex4 >= 0) {
                                pair = new Pair(Integer.valueOf(cursor4.getInt(columnIndex3)), Integer.valueOf(cursor4.getInt(columnIndex4)));
                            } else {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(string, options);
                                Point point2 = new Point(options.outWidth, options.outHeight);
                                pair = new Pair(Integer.valueOf(point2.x), Integer.valueOf(point2.y));
                            }
                            int iIntValue = ((Number) pair.getFirst()).intValue();
                            int iIntValue2 = ((Number) pair.getSecond()).intValue();
                            Integer numLJ = C2286608xc.LJ(iIntValue);
                            Integer numLJ2 = C2286608xc.LJ(iIntValue2);
                            Point point3 = C2360909Mx.LIZJ;
                            if (point3 != null && numLJ != null && numLJ2 != null) {
                                if ((numLJ.intValue() > point3.x || numLJ2.intValue() > point3.y) && (numLJ2.intValue() > point3.x || numLJ.intValue() > point3.y)) {
                                    C20343314it.LIZ.getClass();
                                    C20343314it.LIZ("error: size");
                                } else {
                                    synchronized (c2360909Mx2) {
                                        C1DFH c1dfh = C0PEM.LIZ;
                                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2360809Mw(string, null), 3);
                                    }
                                }
                            }
                        } else {
                            C20343314it c20343314it = C20343314it.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("error: time doesn't match\n  dateAdded: ");
                            sbLIZ.append(lLJFF);
                            sbLIZ.append(" \n  startListenTime: ");
                            sbLIZ.append(l);
                            sbLIZ.append(" \n");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c20343314it.getClass();
                            C20343314it.LIZ(strLIZIZ);
                        }
                    } else {
                        i++;
                    }
                }
            }
            if (!((Cursor) c259800zU.element).isClosed()) {
                ((Cursor) c259800zU.element).close();
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ScreenShotEventDispatcher@c22a.handleMediaContentChange$1");
            return unit2;
        }
        C20343314it.LIZ.getClass();
        C20343314it.LIZ("cannot move to first");
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("ScreenShotEventDispatcher@c22a.handleMediaContentChange$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
