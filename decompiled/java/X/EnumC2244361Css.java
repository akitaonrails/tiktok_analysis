package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Css, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2244361Css implements WireEnum {
    DeepLink(0),
    H5Link(1),
    FollowUser(2),
    Callback(3),
    Show(4),
    Refresh(5);

    public static final ProtoAdapter<EnumC2244361Css> ADAPTER = new EnumAdapter<EnumC2244361Css>() { // from class: X.1Csv
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2244361Css.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2244361Css fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return Refresh;
                        }
                        return Show;
                    }
                    return Callback;
                }
                return FollowUser;
            }
            return H5Link;
        }
        return DeepLink;
    }

    public static EnumC2244361Css valueOf(String str) {
        return (EnumC2244361Css) C08FF.LIZ(EnumC2244361Css.class, str);
    }

    EnumC2244361Css(int i) {
        this.LL = i;
    }
}
