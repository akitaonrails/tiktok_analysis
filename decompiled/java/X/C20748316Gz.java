package X;

import android.content.Context;

/* JADX INFO: renamed from: X.16Gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20748316Gz extends C21674119s3 {
    public final int $t;

    public static final int LJIILL$0(C20748316Gz c20748316Gz) {
        return -1;
    }

    public static final int LJIILL$1(C20748316Gz c20748316Gz) {
        return -1;
    }

    @Override // X.C21674119s3
    public final int LJIILL() {
        switch (this.$t) {
            case 0:
                return LJIILL$0(this);
            case 1:
                return LJIILL$1(this);
            default:
                return super.LJIILL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20748316Gz(Context context, int i) {
        super(context);
        this.$t = i;
    }
}
