package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233521CbO extends Message<C2233521CbO, C2233571CbT> {
    public static final ProtoAdapter<C2233521CbO> ADAPTER = new ProtoAdapter<C2233521CbO>() { // from class: X.1CbR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233521CbO decode(ProtoReader protoReader) {
            C2233571CbT c2233571CbT = new C2233571CbT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2233571CbT.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2233571CbT.LJII.add(ProtoAdapter.INT64.decode(protoReader));
                                    }
                                } else {
                                    c2233571CbT.LJI.add(C1CW4.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c2233571CbT.LJFF.add(C2233171Cap.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c2233571CbT.LJ = C2233581CbU.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2233571CbT.LIZLLL = C2233611CbX.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233571CbT.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233521CbO c2233521CbO) {
            C2233521CbO c2233521CbO2 = c2233521CbO;
            return C2233611CbX.ADAPTER.encodedSizeWithTag(1, c2233521CbO2.biz_source) + C2233581CbU.ADAPTER.encodedSizeWithTag(2, c2233521CbO2.layout_state) + C2233171Cap.ADAPTER.asRepeated().encodedSizeWithTag(3, c2233521CbO2.spot_list) + C1CW4.ADAPTER.asRepeated().encodedSizeWithTag(4, c2233521CbO2.ui_pos_list) + ProtoAdapter.INT64.asPacked().encodedSizeWithTag(5, c2233521CbO2.consumer_list) + c2233521CbO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233521CbO redact(C2233521CbO c2233521CbO) {
            C2233571CbT c2233571CbTNewBuilder = c2233521CbO.newBuilder();
            c2233571CbTNewBuilder.LIZLLL = C2233611CbX.ADAPTER.redact(c2233571CbTNewBuilder.LIZLLL);
            C2233581CbU c2233581CbU = c2233571CbTNewBuilder.LJ;
            if (c2233581CbU != null) {
                c2233571CbTNewBuilder.LJ = C2233581CbU.ADAPTER.redact(c2233581CbU);
            }
            C1516540pZE.LJIIIZ(c2233571CbTNewBuilder.LJFF, C2233171Cap.ADAPTER);
            C1516540pZE.LJIIIZ(c2233571CbTNewBuilder.LJI, C1CW4.ADAPTER);
            c2233571CbTNewBuilder.clearUnknownFields();
            return c2233571CbTNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233521CbO c2233521CbO) {
            C2233521CbO c2233521CbO2 = c2233521CbO;
            C2233611CbX.ADAPTER.encodeWithTag(protoWriter, 1, c2233521CbO2.biz_source);
            C2233581CbU.ADAPTER.encodeWithTag(protoWriter, 2, c2233521CbO2.layout_state);
            C2233171Cap.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c2233521CbO2.spot_list);
            C1CW4.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c2233521CbO2.ui_pos_list);
            ProtoAdapter.INT64.asPacked().encodeWithTag(protoWriter, 5, c2233521CbO2.consumer_list);
            protoWriter.writeBytes(c2233521CbO2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.BizPipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2233611CbX biz_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 5)
    public final List<Long> consumer_list;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutState#ADAPTER", tag = 2)
    public final C2233581CbU layout_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSpotInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<C2233171Cap> spot_list;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C1CW4> ui_pos_list;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.biz_source.hashCode()) * 37;
        C2233581CbU c2233581CbU = this.layout_state;
        int iHashCode2 = ((((((iHashCode + (c2233581CbU != null ? c2233581CbU.hashCode() : 0)) * 37) + this.spot_list.hashCode()) * 37) + this.ui_pos_list.hashCode()) * 37) + this.consumer_list.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2233571CbT newBuilder() {
        C2233571CbT c2233571CbT = new C2233571CbT();
        c2233571CbT.LIZLLL = this.biz_source;
        c2233571CbT.LJ = this.layout_state;
        c2233571CbT.LJFF = C1516540pZE.LIZJ("spot_list", this.spot_list);
        c2233571CbT.LJI = C1516540pZE.LIZJ("ui_pos_list", this.ui_pos_list);
        c2233571CbT.LJII = C1516540pZE.LIZJ("consumer_list", this.consumer_list);
        c2233571CbT.addUnknownFields(unknownFields());
        return c2233571CbT;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", biz_source=");
        sb.append(this.biz_source);
        if (this.layout_state != null) {
            sb.append(", layout_state=");
            sb.append(this.layout_state);
        }
        if (!this.spot_list.isEmpty()) {
            sb.append(", spot_list=");
            sb.append(this.spot_list);
        }
        if (!this.ui_pos_list.isEmpty()) {
            sb.append(", ui_pos_list=");
            sb.append(this.ui_pos_list);
        }
        if (!this.consumer_list.isEmpty()) {
            sb.append(", consumer_list=");
            sb.append(this.consumer_list);
        }
        sb.replace(0, 2, "OutsideLayoutInfoModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233521CbO)) {
            return false;
        }
        C2233521CbO c2233521CbO = (C2233521CbO) obj;
        if (unknownFields().equals(c2233521CbO.unknownFields()) && this.biz_source.equals(c2233521CbO.biz_source) && C1516540pZE.LJ(this.layout_state, c2233521CbO.layout_state) && this.spot_list.equals(c2233521CbO.spot_list) && this.ui_pos_list.equals(c2233521CbO.ui_pos_list) && this.consumer_list.equals(c2233521CbO.consumer_list)) {
            return true;
        }
        return false;
    }

    public C2233521CbO(C2233611CbX c2233611CbX, C2233581CbU c2233581CbU, List<C2233171Cap> list, List<C1CW4> list2, List<Long> list3) {
        this(c2233611CbX, c2233581CbU, list, list2, list3, ByteString.EMPTY);
    }

    public C2233521CbO(C2233611CbX c2233611CbX, C2233581CbU c2233581CbU, List<C2233171Cap> list, List<C1CW4> list2, List<Long> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.biz_source = c2233611CbX;
        this.layout_state = c2233581CbU;
        this.spot_list = C1516540pZE.LJFF("spot_list", list);
        this.ui_pos_list = C1516540pZE.LJFF("ui_pos_list", list2);
        this.consumer_list = C1516540pZE.LJFF("consumer_list", list3);
    }
}
