package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10pC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19363210pC implements WireEnum {
    AnswerNormal(0),
    AnswerTimeout(1),
    AnswerBadWord(2),
    AnswerRiskQuestion(3);

    public static final ProtoAdapter<EnumC19363210pC> ADAPTER = new EnumAdapter<EnumC19363210pC>() { // from class: X.10pD
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19363210pC.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19363210pC fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return AnswerRiskQuestion;
                }
                return AnswerBadWord;
            }
            return AnswerTimeout;
        }
        return AnswerNormal;
    }

    public static EnumC19363210pC valueOf(String str) {
        return (EnumC19363210pC) C08FF.LIZ(EnumC19363210pC.class, str);
    }

    EnumC19363210pC(int i) {
        this.LL = i;
    }
}
