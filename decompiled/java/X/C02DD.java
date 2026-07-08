package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DD extends Message<C02DD, C02K3> {
    public static final ProtoAdapter<C02DD> ADAPTER = new ProtoAdapter<C02DD>() { // from class: X.025g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DD decode(ProtoReader protoReader) {
            C02DD c02dd = new C02DD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02dd.live_photo_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02dd.live_photo = AnonymousClass0213.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02dd.live_photo_vid = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02dd.is_live_photo = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DD c02dd) {
            C02DD c02dd2 = c02dd;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c02dd2.is_live_photo) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02dd2.live_photo_vid) + AnonymousClass0213.ADAPTER.encodedSizeWithTag(3, c02dd2.live_photo) + ProtoAdapter.INT32.encodedSizeWithTag(4, c02dd2.live_photo_type) + c02dd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DD c02dd) {
            C02DD c02dd2 = c02dd;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02dd2.is_live_photo);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c02dd2.live_photo_vid);
            AnonymousClass0213.ADAPTER.encodeWithTag(protoWriter, 3, c02dd2.live_photo);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c02dd2.live_photo_type);
            protoWriter.writeBytes(c02dd2.unknownFields());
        }
    };
    public Boolean is_live_photo;
    public AnonymousClass0213 live_photo;
    public Integer live_photo_type;
    public String live_photo_vid;

    public C02DD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02K3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
