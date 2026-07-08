package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242071CpB extends Message<C2242071CpB, C2242111CpF> {
    public static final ProtoAdapter<C2242071CpB> ADAPTER = new ProtoAdapter<C2242071CpB>() { // from class: X.1CpC
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242071CpB decode(ProtoReader protoReader) {
            C2242111CpF c2242111CpF = new C2242111CpF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2242111CpF.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2242111CpF.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2242111CpF.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2242111CpF.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2242111CpF.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2242111CpF.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c2242111CpF.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            try {
                                c2242111CpF.LJIIJ = C18SX.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2242111CpF.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2242111CpF.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2242111CpF.LJIIL.putAll(this.LIZ.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2242111CpF.LJIILIIL = C2242091CpD.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2242111CpF.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242111CpF.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242071CpB c2242071CpB) {
            C2242071CpB c2242071CpB2 = c2242071CpB;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2242071CpB2.card_key) + protoAdapter.encodedSizeWithTag(2, c2242071CpB2.schema) + protoAdapter.encodedSizeWithTag(3, c2242071CpB2.card_template) + protoAdapter.encodedSizeWithTag(4, c2242071CpB2.business_type) + protoAdapter.encodedSizeWithTag(5, c2242071CpB2.business_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, c2242071CpB2.default_height) + protoAdapter2.encodedSizeWithTag(7, c2242071CpB2.default_width) + C18SX.ADAPTER.encodedSizeWithTag(8, c2242071CpB2.ui_location_type) + protoAdapter.encodedSizeWithTag(9, c2242071CpB2.raw_data) + this.LIZ.encodedSizeWithTag(10, c2242071CpB2.biz_params) + C2242091CpD.ADAPTER.encodedSizeWithTag(11, c2242071CpB2.dynamic_card_client_info) + c2242071CpB2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242071CpB redact(C2242071CpB c2242071CpB) {
            C2242111CpF c2242111CpFNewBuilder = c2242071CpB.newBuilder();
            C2242091CpD c2242091CpD = c2242111CpFNewBuilder.LJIILIIL;
            if (c2242091CpD != null) {
                c2242111CpFNewBuilder.LJIILIIL = C2242091CpD.ADAPTER.redact(c2242091CpD);
            }
            c2242111CpFNewBuilder.clearUnknownFields();
            return c2242111CpFNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242071CpB c2242071CpB) {
            C2242071CpB c2242071CpB2 = c2242071CpB;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2242071CpB2.card_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c2242071CpB2.schema);
            protoAdapter.encodeWithTag(protoWriter, 3, c2242071CpB2.card_template);
            protoAdapter.encodeWithTag(protoWriter, 4, c2242071CpB2.business_type);
            protoAdapter.encodeWithTag(protoWriter, 5, c2242071CpB2.business_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 6, c2242071CpB2.default_height);
            protoAdapter2.encodeWithTag(protoWriter, 7, c2242071CpB2.default_width);
            C18SX.ADAPTER.encodeWithTag(protoWriter, 8, c2242071CpB2.ui_location_type);
            protoAdapter.encodeWithTag(protoWriter, 9, c2242071CpB2.raw_data);
            this.LIZ.encodeWithTag(protoWriter, 10, c2242071CpB2.biz_params);
            C2242091CpD.ADAPTER.encodeWithTag(protoWriter, 11, c2242071CpB2.dynamic_card_client_info);
            protoWriter.writeBytes(c2242071CpB2.unknownFields());
        }
    };
    public static final Integer DEFAULT_DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_DEFAULT_WIDTH = 0;
    public static final C18SX DEFAULT_UI_LOCATION_TYPE = C18SX.MessageNormal;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Map<String, String> biz_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String business_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String business_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String card_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String card_template;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer default_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer default_width;

    @WireField(adapter = "com.bytedance.im.message.template.proto.DynamicCardClientInfo#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C2242091CpD dynamic_card_client_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public final String raw_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String schema;

    @WireField(adapter = "com.bytedance.im.message.template.proto.UiLocationType#ADAPTER", tag = 8)
    public final C18SX ui_location_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.card_key;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.schema;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.card_template;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.business_type;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.business_id;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num = this.default_height;
        int iHashCode7 = (iHashCode6 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.default_width;
        int iHashCode8 = (iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 37;
        C18SX c18sx = this.ui_location_type;
        int iHashCode9 = (iHashCode8 + (c18sx != null ? c18sx.hashCode() : 0)) * 37;
        String str6 = this.raw_data;
        int iHashCode10 = (((iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37) + this.biz_params.hashCode()) * 37;
        C2242091CpD c2242091CpD = this.dynamic_card_client_info;
        int iHashCode11 = iHashCode10 + (c2242091CpD != null ? c2242091CpD.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public C2242111CpF newBuilder() {
        C2242111CpF c2242111CpF = new C2242111CpF();
        c2242111CpF.LIZLLL = this.card_key;
        c2242111CpF.LJ = this.schema;
        c2242111CpF.LJFF = this.card_template;
        c2242111CpF.LJI = this.business_type;
        c2242111CpF.LJII = this.business_id;
        c2242111CpF.LJIIIIZZ = this.default_height;
        c2242111CpF.LJIIIZ = this.default_width;
        c2242111CpF.LJIIJ = this.ui_location_type;
        c2242111CpF.LJIIJJI = this.raw_data;
        c2242111CpF.LJIIL = C1516540pZE.LIZLLL("biz_params", this.biz_params);
        c2242111CpF.LJIILIIL = this.dynamic_card_client_info;
        c2242111CpF.addUnknownFields(unknownFields());
        return c2242111CpF;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.card_key != null) {
            sb.append(", card_key=");
            sb.append(this.card_key);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.card_template != null) {
            sb.append(", card_template=");
            sb.append(this.card_template);
        }
        if (this.business_type != null) {
            sb.append(", business_type=");
            sb.append(this.business_type);
        }
        if (this.business_id != null) {
            sb.append(", business_id=");
            sb.append(this.business_id);
        }
        if (this.default_height != null) {
            sb.append(", default_height=");
            sb.append(this.default_height);
        }
        if (this.default_width != null) {
            sb.append(", default_width=");
            sb.append(this.default_width);
        }
        if (this.ui_location_type != null) {
            sb.append(", ui_location_type=");
            sb.append(this.ui_location_type);
        }
        if (this.raw_data != null) {
            sb.append(", raw_data=");
            sb.append(this.raw_data);
        }
        if (!this.biz_params.isEmpty()) {
            sb.append(", biz_params=");
            sb.append(this.biz_params);
        }
        if (this.dynamic_card_client_info != null) {
            sb.append(", dynamic_card_client_info=");
            sb.append(this.dynamic_card_client_info);
        }
        sb.replace(0, 2, "DynamicInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242071CpB)) {
            return false;
        }
        C2242071CpB c2242071CpB = (C2242071CpB) obj;
        if (unknownFields().equals(c2242071CpB.unknownFields()) && C1516540pZE.LJ(this.card_key, c2242071CpB.card_key) && C1516540pZE.LJ(this.schema, c2242071CpB.schema) && C1516540pZE.LJ(this.card_template, c2242071CpB.card_template) && C1516540pZE.LJ(this.business_type, c2242071CpB.business_type) && C1516540pZE.LJ(this.business_id, c2242071CpB.business_id) && C1516540pZE.LJ(this.default_height, c2242071CpB.default_height) && C1516540pZE.LJ(this.default_width, c2242071CpB.default_width) && C1516540pZE.LJ(this.ui_location_type, c2242071CpB.ui_location_type) && C1516540pZE.LJ(this.raw_data, c2242071CpB.raw_data) && this.biz_params.equals(c2242071CpB.biz_params) && C1516540pZE.LJ(this.dynamic_card_client_info, c2242071CpB.dynamic_card_client_info)) {
            return true;
        }
        return false;
    }

    public C2242071CpB(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, C18SX c18sx, String str6, Map<String, String> map, C2242091CpD c2242091CpD) {
        this(str, str2, str3, str4, str5, num, num2, c18sx, str6, map, c2242091CpD, ByteString.EMPTY);
    }

    public C2242071CpB(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, C18SX c18sx, String str6, Map<String, String> map, C2242091CpD c2242091CpD, ByteString byteString) {
        super(ADAPTER, byteString);
        this.card_key = str;
        this.schema = str2;
        this.card_template = str3;
        this.business_type = str4;
        this.business_id = str5;
        this.default_height = num;
        this.default_width = num2;
        this.ui_location_type = c18sx;
        this.raw_data = str6;
        this.biz_params = C1516540pZE.LJI("biz_params", map);
        this.dynamic_card_client_info = c2242091CpD;
    }
}
