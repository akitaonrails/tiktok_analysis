package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CUI extends Message<C1CUI, C1CUK> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkmicUserSettingShowAction#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CUQ anchor_new_fix_mic_num;

    @WireField(adapter = "link_mic_sdk.proto.LinkmicUserSettingLayout#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CUL anchor_new_layout;
    public static final ProtoAdapter<C1CUI> ADAPTER = new ProtoAdapter<C1CUI>() { // from class: X.1CUJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CUI decode(ProtoReader protoReader) {
            C1CUK c1cuk = new C1CUK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cuk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c1cuk.LJ = C1CUQ.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cuk.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        try {
                            c1cuk.LIZLLL = C1CUL.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c1cuk.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cuk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CUI c1cui) {
            C1CUI c1cui2 = c1cui;
            return C1CUL.ADAPTER.encodedSizeWithTag(1, c1cui2.anchor_new_layout) + C1CUQ.ADAPTER.encodedSizeWithTag(2, c1cui2.anchor_new_fix_mic_num) + c1cui2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CUI redact(C1CUI c1cui) {
            C1CUK c1cukNewBuilder = c1cui.newBuilder();
            c1cukNewBuilder.clearUnknownFields();
            return c1cukNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CUI c1cui) {
            C1CUI c1cui2 = c1cui;
            C1CUL.ADAPTER.encodeWithTag(protoWriter, 1, c1cui2.anchor_new_layout);
            C1CUQ.ADAPTER.encodeWithTag(protoWriter, 2, c1cui2.anchor_new_fix_mic_num);
            protoWriter.writeBytes(c1cui2.unknownFields());
        }
    };
    public static final C1CUL DEFAULT_ANCHOR_NEW_LAYOUT = C1CUL.VAR_LINKMIC_USER_SETTING_LAYOUT_GRID;
    public static final C1CUQ DEFAULT_ANCHOR_NEW_FIX_MIC_NUM = C1CUQ.VAR_LINKMIC_USER_SETTING_SHOW_ACTION_CHECKED;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.anchor_new_layout.hashCode()) * 37) + this.anchor_new_fix_mic_num.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CUK newBuilder() {
        C1CUK c1cuk = new C1CUK();
        c1cuk.LIZLLL = this.anchor_new_layout;
        c1cuk.LJ = this.anchor_new_fix_mic_num;
        c1cuk.addUnknownFields(unknownFields());
        return c1cuk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", anchor_new_layout=");
        sb.append(this.anchor_new_layout);
        sb.append(", anchor_new_fix_mic_num=");
        sb.append(this.anchor_new_fix_mic_num);
        sb.replace(0, 2, "LinkMicJoinChannelRspBizExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CUI)) {
            return false;
        }
        C1CUI c1cui = (C1CUI) obj;
        if (unknownFields().equals(c1cui.unknownFields()) && this.anchor_new_layout.equals(c1cui.anchor_new_layout) && this.anchor_new_fix_mic_num.equals(c1cui.anchor_new_fix_mic_num)) {
            return true;
        }
        return false;
    }

    public C1CUI(C1CUL c1cul, C1CUQ c1cuq) {
        this(c1cul, c1cuq, ByteString.EMPTY);
    }

    public C1CUI(C1CUL c1cul, C1CUQ c1cuq, ByteString byteString) {
        super(ADAPTER, byteString);
        this.anchor_new_layout = c1cul;
        this.anchor_new_fix_mic_num = c1cuq;
    }
}
