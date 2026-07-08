package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BX extends Message<C02BX, C02MH> {
    public static final ProtoAdapter<C02BX> ADAPTER = new ProtoAdapter<C02BX>() { // from class: X.0246
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BX decode(ProtoReader protoReader) {
            C02BX c02bx = new C02BX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02bx.audio = C02BA.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02bx.video_control = C02A4.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02bx.trailer_start_time = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c02bx.long_video_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02bx.video = AnonymousClass0213.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BX c02bx) {
            C02BX c02bx2 = c02bx;
            return AnonymousClass0213.ADAPTER.encodedSizeWithTag(1, c02bx2.video) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02bx2.long_video_type) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, c02bx2.trailer_start_time) + C02A4.ADAPTER.encodedSizeWithTag(4, c02bx2.video_control) + C02BA.ADAPTER.encodedSizeWithTag(5, c02bx2.audio) + c02bx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02BX c02bx) {
            C02BX c02bx2 = c02bx;
            AnonymousClass0213.ADAPTER.encodeWithTag(protoWriter, 1, c02bx2.video);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c02bx2.long_video_type);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, c02bx2.trailer_start_time);
            C02A4.ADAPTER.encodeWithTag(protoWriter, 4, c02bx2.video_control);
            C02BA.ADAPTER.encodeWithTag(protoWriter, 5, c02bx2.audio);
            protoWriter.writeBytes(c02bx2.unknownFields());
        }
    };
    public C02BA audio;
    public Integer long_video_type;
    public Double trailer_start_time;
    public AnonymousClass0213 video;
    public C02A4 video_control;

    public C02BX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
