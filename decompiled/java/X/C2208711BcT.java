package X;

import com.ss.android.vesdk.VEConfigCenter;

/* JADX INFO: renamed from: X.1BcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208711BcT implements InterfaceC2208731BcV {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ VEConfigCenter.ValuePkt LIZIZ;

    @Override // X.InterfaceC2208731BcV
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC2208731BcV
    public final Object LIZ() {
        return this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC2208731BcV
    public final EnumC2208691BcR type() {
        VEConfigCenter.DataType dataType = this.LIZIZ.getDataType();
        if (dataType != null) {
            int i = C2208801Bcc.LIZ[dataType.ordinal()];
            if (i == 1) {
                return EnumC2208691BcR.Long;
            }
            if (i == 2) {
                return EnumC2208691BcR.Boolean;
            }
            if (i == 3) {
                return EnumC2208691BcR.Float;
            }
            if (i == 4) {
                return EnumC2208691BcR.Integer;
            }
            if (i == 5) {
                return EnumC2208691BcR.String;
            }
        }
        return EnumC2208691BcR.String;
    }

    @Override // X.InterfaceC2208731BcV
    public final String key() {
        return this.LIZ;
    }

    public C2208711BcT(String str, VEConfigCenter.ValuePkt valuePkt) {
        this.LIZ = str;
        this.LIZIZ = valuePkt;
    }
}
