package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2241491CoF implements WireEnum {
    InProgress(1),
    Finish(2),
    Fail(3),
    Recall(4),
    Expired(5),
    Unsupported(6);

    public static final ProtoAdapter<EnumC2241491CoF> ADAPTER = new EnumAdapter<EnumC2241491CoF>() { // from class: X.1CoK
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2241491CoF.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2241491CoF fromValue(int i) {
        switch (i) {
            case 1:
                return InProgress;
            case 2:
                return Finish;
            case 3:
                return Fail;
            case 4:
                return Recall;
            case 5:
                return Expired;
            case 6:
                return Unsupported;
            default:
                return null;
        }
    }

    public static EnumC2241491CoF valueOf(String str) {
        return (EnumC2241491CoF) C08FF.LIZ(EnumC2241491CoF.class, str);
    }

    EnumC2241491CoF(int i) {
        this.LL = i;
    }
}
