package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BE extends Message<C02BE, C02ID> {
    public static final ProtoAdapter<C02BE> ADAPTER = new ProtoAdapter<C02BE>() { // from class: X.024G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BE decode(ProtoReader protoReader) {
            C02BE c02be = new C02BE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02be.code = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02be.show_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c02be.toast_msg = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02be.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02be.transcode = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02be.mute = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c02be.popup_msg = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02be.platform_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02be.action_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02be;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BE c02be) {
            C02BE c02be2 = c02be;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02be2.code) + protoAdapter.encodedSizeWithTag(2, c02be2.show_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02be2.toast_msg) + protoAdapter2.encodedSizeWithTag(4, c02be2.extra) + protoAdapter.encodedSizeWithTag(5, c02be2.transcode) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c02be2.mute) + protoAdapter2.encodedSizeWithTag(7, c02be2.popup_msg) + protoAdapter2.encodedSizeWithTag(8, c02be2.platform_id) + protoAdapter2.encodedSizeWithTag(9, c02be2.action_id) + c02be2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02BE c02be) {
            C02BE c02be2 = c02be;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02be2.code);
            protoAdapter.encodeWithTag(protoWriter, 2, c02be2.show_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c02be2.toast_msg);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02be2.extra);
            protoAdapter.encodeWithTag(protoWriter, 5, c02be2.transcode);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c02be2.mute);
            protoAdapter2.encodeWithTag(protoWriter, 7, c02be2.popup_msg);
            protoAdapter2.encodeWithTag(protoWriter, 8, c02be2.platform_id);
            protoAdapter2.encodeWithTag(protoWriter, 9, c02be2.action_id);
            protoWriter.writeBytes(c02be2.unknownFields());
        }
    };
    public String action_id;
    public Integer code;
    public String extra;
    public Boolean mute;
    public String platform_id;
    public String popup_msg;
    public Integer show_type;
    public String toast_msg;
    public Integer transcode;

    public C02BE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02ID newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
