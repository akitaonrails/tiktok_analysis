package com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes32.dex */
public final class Vec2 extends PointF {
    public static final int $stable = 8;

    public final Vec2 LIZIZ() {
        float f = ((PointF) this).x;
        float f2 = ((PointF) this).y;
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        return new Vec2(((PointF) this).x / fSqrt, ((PointF) this).y / fSqrt);
    }

    public final Vec2 LIZ(Vec2 vec2) {
        return new Vec2(((PointF) this).x - ((PointF) vec2).x, ((PointF) this).y - ((PointF) vec2).y);
    }

    public final Vec2 LIZJ(float f) {
        return new Vec2(((PointF) this).x * f, ((PointF) this).y * f);
    }

    public Vec2(float f, float f2) {
        super(f, f2);
    }
}
