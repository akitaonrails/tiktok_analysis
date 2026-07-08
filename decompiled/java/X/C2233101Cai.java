package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233101Cai extends Message<C2233101Cai, C2233121Cak> {
    public static final ProtoAdapter<C2233101Cai> ADAPTER = new ProtoAdapter<C2233101Cai>() { // from class: X.1Caj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233101Cai decode(ProtoReader protoReader) {
            C2233121Cak c2233121Cak = new C2233121Cak();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2233121Cak.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2233121Cak.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c2233121Cak.LJ = C1CXY.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2233121Cak.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2233121Cak.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233121Cak.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233101Cai c2233101Cai) {
            C2233101Cai c2233101Cai2 = c2233101Cai;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2233101Cai2.key) + C1CXY.ADAPTER.encodedSizeWithTag(2, c2233101Cai2.k_type) + protoAdapter.encodedSizeWithTag(3, c2233101Cai2.default_value) + c2233101Cai2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233101Cai redact(C2233101Cai c2233101Cai) {
            C2233121Cak c2233121CakNewBuilder = c2233101Cai.newBuilder();
            c2233121CakNewBuilder.clearUnknownFields();
            return c2233121CakNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233101Cai c2233101Cai) {
            C2233101Cai c2233101Cai2 = c2233101Cai;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2233101Cai2.key);
            C1CXY.ADAPTER.encodeWithTag(protoWriter, 2, c2233101Cai2.k_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c2233101Cai2.default_value);
            protoWriter.writeBytes(c2233101Cai2.unknownFields());
        }
    };
    public static final C1CXY DEFAULT_K_TYPE = C1CXY.VAR_LIVE_SETTING_TYPE_BOOL;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String default_value;

    @WireField(adapter = "link_mic_sdk.proto.LiveSettingType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CXY k_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String key;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.k_type.hashCode()) * 37) + this.default_value.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233121Cak newBuilder() {
        C2233121Cak c2233121Cak = new C2233121Cak();
        c2233121Cak.LIZLLL = this.key;
        c2233121Cak.LJ = this.k_type;
        c2233121Cak.LJFF = this.default_value;
        c2233121Cak.addUnknownFields(unknownFields());
        return c2233121Cak;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", k_type=");
        sb.append(this.k_type);
        sb.append(", default_value=");
        sb.append(this.default_value);
        sb.replace(0, 2, "LiveSetting{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233101Cai)) {
            return false;
        }
        C2233101Cai c2233101Cai = (C2233101Cai) obj;
        if (unknownFields().equals(c2233101Cai.unknownFields()) && this.key.equals(c2233101Cai.key) && this.k_type.equals(c2233101Cai.k_type) && this.default_value.equals(c2233101Cai.default_value)) {
            return true;
        }
        return false;
    }

    public C2233101Cai(String str, C1CXY c1cxy, String str2) {
        this(str, c1cxy, str2, ByteString.EMPTY);
    }

    public C2233101Cai(String str, C1CXY c1cxy, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.k_type = c1cxy;
        this.default_value = str2;
    }
}
