package Y;

import X.C0M7N;
import X.C0M81;
import X.C1C7U;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS30S0310000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS8S3300000_8;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS1S3300000_8 implements Runnable {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS1S3300000_8 aRunnableS1S3300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("EditExitController@7e76.saveDraftWithNewCreationId$2");
        try {
            C0M7N c0m7n = (C0M7N) aRunnableS1S3300000_8.l3;
            C0M7N.LIZLLL(c0m7n, null, new AwS8S3300000_8(c0m7n, (C0M7N) aRunnableS1S3300000_8.s0, aRunnableS1S3300000_8.s1, aRunnableS1S3300000_8.s2, (String) aRunnableS1S3300000_8.l4, (Function0<Unit>) aRunnableS1S3300000_8.l5, (Function1<? super VideoPublishEditModel, Unit>) 3), 3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditExitController@7e76.saveDraftWithNewCreationId$2");
    }

    public static final void run$1(ARunnableS1S3300000_8 aRunnableS1S3300000_8) {
        boolean zLIZ;
        C1C7U.LIZ("UnitedEditExitController@e758.saveDraftWithNewCreationId$2");
        try {
            C0M81 c0m81 = (C0M81) aRunnableS1S3300000_8.l3;
            C0M81.LIZJ(c0m81, null, new AwS8S3300000_8(c0m81, (C0M81) aRunnableS1S3300000_8.s0, aRunnableS1S3300000_8.s1, aRunnableS1S3300000_8.s2, (String) aRunnableS1S3300000_8.l4, (Function0<Unit>) aRunnableS1S3300000_8.l5, (Function1<? super VideoPublishEditModel, Unit>) 4), 3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UnitedEditExitController@e758.saveDraftWithNewCreationId$2");
    }

    public ARunnableS1S3300000_8(C0M81 c0m81, String str, String str2, AwS409S0200000_8 awS409S0200000_8, AwS30S0310000_8 awS30S0310000_8, int i) {
        this.$t = i;
        this.l3 = c0m81;
        this.s0 = "clickPopupFromEdit";
        this.s1 = str;
        this.s2 = str2;
        this.l4 = awS409S0200000_8;
        this.l5 = awS30S0310000_8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S3300000_8(C0M7N c0m7n, C0M7N c0m7n2, String str, String str2, String str3, Function0<Unit> function0, Function1<? super VideoPublishEditModel, Unit> function1) {
        this.$t = function1;
        this.l3 = c0m7n;
        this.s0 = c0m7n2;
        this.s1 = str;
        this.s2 = str2;
        this.l4 = str3;
        this.l5 = function0;
    }
}
