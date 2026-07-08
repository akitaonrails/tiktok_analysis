package X;

import android.graphics.PointF;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.Vec2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1596, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1596 {
    public final AnonymousClass1594 LIZ;
    public final C159G LIZIZ;

    public AnonymousClass1596(AnonymousClass1594 anonymousClass1594, Vec2 vec2, Vec2 vec22, boolean z, boolean z2) {
        Vec2 vec23;
        float fAtan2;
        float f;
        float f2;
        boolean z3;
        boolean z4;
        this.LIZ = anonymousClass1594;
        Vec2 vec24 = new Vec2(0.5f, 0.5f);
        Vec2 vec25 = new Vec2(0.0f, -1.0f);
        Vec2 vec2LIZIZ = vec22.LIZ(vec2).LIZIZ();
        anonymousClass1594.getClass();
        Vec2 vec2LIZ = vec2.LIZ(vec2LIZIZ.LIZJ(0.15f));
        Vec2 vec2LIZIZ2 = vec22.LIZ(vec2).LIZIZ();
        Vec2 vec2LIZIZ3 = vec24.LIZ(vec2).LIZIZ();
        Vec2 vec26 = new Vec2(((PointF) vec2LIZIZ2).y, -((PointF) vec2LIZIZ2).x);
        Vec2 vec27 = new Vec2(-((PointF) vec2LIZIZ2).y, ((PointF) vec2LIZIZ2).x);
        vec26 = AnonymousClass1599.LIZ(vec2LIZIZ3, vec26) <= AnonymousClass1599.LIZ(vec2LIZIZ3, vec27) ? vec27 : vec26;
        if (Math.abs((((PointF) vec25).x * ((PointF) vec2LIZIZ).y) - (((PointF) vec25).y * ((PointF) vec2LIZIZ).x)) < 1.0E-4f) {
            if (z) {
                vec23 = new Vec2(-((PointF) vec26).x, -((PointF) vec26).y);
            } else {
                vec23 = vec26;
            }
            if (((PointF) vec26).x > 0.0f) {
                fAtan2 = 0.0f;
                f = 120.0f;
            } else {
                fAtan2 = -0.0f;
                f = -120.0f;
            }
            if (Math.abs((((PointF) vec25).x * ((PointF) vec2LIZIZ).y) - (((PointF) vec25).y * ((PointF) vec2LIZIZ).x)) < 1.0E-4f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (AnonymousClass1599.LIZ(vec25, vec2LIZIZ) > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 && z4) {
                if (!z) {
                    fAtan2 = -fAtan2;
                    f = -f;
                }
            } else if (z) {
                fAtan2 = -fAtan2;
                f = -f;
            }
        } else {
            Vec2 vec28 = new Vec2(((PointF) vec2LIZIZ).y, -((PointF) vec2LIZIZ).x);
            Vec2 vec29 = new Vec2(-((PointF) vec2LIZIZ).y, ((PointF) vec2LIZIZ).x);
            Vec2 vec210 = new Vec2(0.0f, -1.0f);
            vec28 = AnonymousClass1599.LIZ(vec210, vec28) <= AnonymousClass1599.LIZ(vec210, vec29) ? vec29 : vec28;
            if (z) {
                vec23 = new Vec2(-((PointF) vec28).x, -((PointF) vec28).y);
            } else {
                vec23 = vec28;
            }
            vec2LIZ = vec2LIZ.LIZ(vec23.LIZJ(0.0f));
            fAtan2 = (((float) Math.atan2(((PointF) vec28).x, -((PointF) vec28).y)) * 180.0f) / 3.1415927f;
            fAtan2 = fAtan2 > 180.0f ? fAtan2 - 360.0f : fAtan2;
            float fAtan22 = (((float) Math.atan2(((PointF) vec2LIZIZ).x, -((PointF) vec2LIZIZ).y)) * 180.0f) / 3.1415927f;
            fAtan22 = fAtan22 > 180.0f ? fAtan22 - 360.0f : fAtan22;
            f = ((z2 ? 0.5f / 2 : 0.5f) * ((z ? -fAtan22 : fAtan22) - fAtan2)) + fAtan2;
        }
        AnonymousClass1597 anonymousClass1597 = new AnonymousClass1597(fAtan2, f, vec2LIZ, vec22, vec23);
        List<AnonymousClass1598> list = anonymousClass1594.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (AnonymousClass1598 anonymousClass1598 : list) {
            float f3 = anonymousClass1598.LIZJ;
            Vec2 vec2LIZ2 = LIZ(anonymousClass1598.LIZIZ, z2 ? f3 / 3.0f : f3, anonymousClass1597.LIZ, anonymousClass1597.LIZIZ, anonymousClass1597.LIZJ);
            float f4 = anonymousClass1598.LJ;
            Vec2 vec2LIZ3 = LIZ(anonymousClass1598.LIZLLL, z2 ? f4 / 3.0f : f4, anonymousClass1597.LIZ, anonymousClass1597.LIZIZ, anonymousClass1597.LIZJ);
            if (anonymousClass1598.LJI) {
                f2 = anonymousClass1597.LJ;
            } else {
                f2 = anonymousClass1597.LIZLLL;
            }
            this.LIZ.getClass();
            arrayList.add(new C159C(vec2LIZ2, vec2LIZ3, (long) (anonymousClass1598.LIZ * 1000.0f), anonymousClass1598.LJFF, f2));
        }
        this.LIZIZ = new C159G(this.LIZ.LIZ, arrayList);
    }

    public static Vec2 LIZ(float f, float f2, Vec2 vec2, Vec2 vec22, Vec2 vec23) {
        Vec2 vec2LIZIZ = vec22.LIZ(vec2).LIZIZ();
        Vec2 vec2LIZ = vec22.LIZ(vec2);
        float f3 = ((PointF) vec2LIZ).x;
        float f4 = ((PointF) vec2LIZ).y;
        float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
        Vec2 vec2LIZJ = vec2LIZIZ.LIZJ(f * fSqrt);
        Vec2 vec24 = new Vec2(((PointF) vec2).x + ((PointF) vec2LIZJ).x, ((PointF) vec2).y + ((PointF) vec2LIZJ).y);
        Vec2 vec2LIZJ2 = vec23.LIZJ(fSqrt).LIZJ(f2);
        return new Vec2(((PointF) vec24).x + ((PointF) vec2LIZJ2).x, ((PointF) vec24).y + ((PointF) vec2LIZJ2).y);
    }
}
