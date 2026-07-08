package Y;

import X.C1C7U;
import X.C786410Ut5;
import X.C787960Uva;
import X.C790240UzG;
import X.C791870V4n;
import X.C793770VBv;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS0S3101200_13 implements Runnable {
    public final int $t;
    public int i4;
    public long j5;
    public long j6;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        JSONObject jSONObjectLIZ = new C790240UzG("api_all", this.j5, this.j6, this.s0, this.s1, this.s2, this.i4, (JSONObject) this.l3).LIZ();
        if (jSONObjectLIZ != null) {
            C793770VBv.LJIIZILJ("monitorSLA", C786410Ut5.J3(jSONObjectLIZ));
        }
    }

    public final void LIZ$1() {
        C791870V4n.LIZ(this.s0);
        C787960Uva.LIZ.LIZJ(new C790240UzG("api_error", this.j5, this.j6, this.s0, this.s1, this.s2, this.i4, C793770VBv.LJIILIIL((JSONObject) this.l3, false)));
    }

    public final void LIZ$2() {
        JSONObject jSONObjectLIZ = new C790240UzG("api_error", this.j5, this.j6, this.s0, this.s1, this.s2, this.i4, (JSONObject) this.l3).LIZ();
        if (jSONObjectLIZ != null) {
            C793770VBv.LJIIZILJ("monitorApiError", C786410Ut5.J3(jSONObjectLIZ));
        }
    }

    public final void LIZ$3() {
        C791870V4n.LIZ(this.s0);
        C787960Uva.LIZ.LIZJ(new C790240UzG("api_all", this.j5, this.j6, this.s0, this.s1, this.s2, this.i4, C793770VBv.LJIILIIL((JSONObject) this.l3, false)));
    }

    public final void LIZ$4() {
        JSONObject jSONObjectLIZ = new C790240UzG("api_all", this.j5, this.j6, this.s0, this.s1, this.s2, this.i4, (JSONObject) this.l3).LIZ();
        if (jSONObjectLIZ != null) {
            C793770VBv.LJIIZILJ("monitorSLA", C786410Ut5.J3(jSONObjectLIZ));
        }
    }

    public final void LIZ$5() {
        C791870V4n.LIZ(this.s0);
        C787960Uva.LIZ.LIZJ(new C790240UzG("api_error", this.j5, this.j6, this.s0, this.s1, this.s2, this.i4, C793770VBv.LJIILIIL((JSONObject) this.l3, false)));
    }

    public final void LIZ$6() {
        JSONObject jSONObjectLIZ = new C790240UzG("api_error", this.j5, this.j6, this.s0, this.s1, this.s2, this.i4, (JSONObject) this.l3).LIZ();
        if (jSONObjectLIZ != null) {
            C793770VBv.LJIIZILJ("monitorApiError", C786410Ut5.J3(jSONObjectLIZ));
        }
    }

    public static final void run$0(ARunnableS0S3101200_13 aRunnableS0S3101200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorSLA$2");
        try {
            aRunnableS0S3101200_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorSLA$2");
    }

    public static final void run$1(ARunnableS0S3101200_13 aRunnableS0S3101200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorApiError$1");
        try {
            aRunnableS0S3101200_13.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorApiError$1");
    }

    public static final void run$2(ARunnableS0S3101200_13 aRunnableS0S3101200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorApiError$2");
        try {
            aRunnableS0S3101200_13.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorApiError$2");
    }

    public static final void run$3(ARunnableS0S3101200_13 aRunnableS0S3101200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorSLA$3");
        try {
            aRunnableS0S3101200_13.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorSLA$3");
    }

    public static final void run$4(ARunnableS0S3101200_13 aRunnableS0S3101200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorSLA$4");
        try {
            aRunnableS0S3101200_13.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorSLA$4");
    }

    public static final void run$5(ARunnableS0S3101200_13 aRunnableS0S3101200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorApiError$3");
        try {
            aRunnableS0S3101200_13.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorApiError$3");
    }

    public static final void run$6(ARunnableS0S3101200_13 aRunnableS0S3101200_13) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorApiError$4");
        try {
            aRunnableS0S3101200_13.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorApiError$4");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS0S3101200_13(long r2, long r4, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, org.json.JSONObject r10, int r11) {
        /*
            r1 = this;
            r1.$t = r11
            switch(r11) {
                case 0: goto L18;
                case 1: goto L5;
                case 2: goto L18;
                case 3: goto L5;
                case 4: goto L18;
                case 5: goto L5;
                case 6: goto L18;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r6
            r0.j5 = r2
            r0.j6 = r4
            r0.s1 = r7
            r0.s2 = r8
            r0.i4 = r9
            r0.l3 = r10
        L14:
            r0.<init>()
            return
        L18:
            r0 = r1
            r0.j5 = r2
            r0.j6 = r4
            r0.s0 = r6
            r0.s1 = r7
            r0.s2 = r8
            r0.i4 = r9
            r0.l3 = r10
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S3101200_13.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject, int):void");
    }
}
