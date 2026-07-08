package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Csg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2244241Csg implements WireEnum {
    Video(0),
    Live(1);

    public static final ProtoAdapter<EnumC2244241Csg> ADAPTER = new EnumAdapter<EnumC2244241Csg>() { // from class: X.1Csl
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2244241Csg.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2244241Csg fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return Live;
        }
        return Video;
    }

    public static EnumC2244241Csg valueOf(String str) {
        return (EnumC2244241Csg) C08FF.LIZ(EnumC2244241Csg.class, str);
    }

    EnumC2244241Csg(int i) {
        this.LL = i;
    }
}
