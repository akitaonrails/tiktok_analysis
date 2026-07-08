package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02mx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C691702mx extends Message<C691702mx, C691602mw> {
    public static final ProtoAdapter<C691702mx> ADAPTER = new ProtoAdapter<C691702mx>() { // from class: X.02my
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C691702mx decode(ProtoReader protoReader) {
            C691702mx c691702mx = new C691702mx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 6) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c691702mx.play_addr_bytevc1 = C673002jw.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c691702mx.play_addr = C673002jw.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c691702mx.voice_type = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c691702mx.language_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c691702mx.lang = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c691702mx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C691702mx c691702mx) {
            C691702mx c691702mx2 = c691702mx;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c691702mx2.lang) + ProtoAdapter.INT64.encodedSizeWithTag(2, c691702mx2.language_id) + protoAdapter.encodedSizeWithTag(3, c691702mx2.voice_type);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c691702mx2.play_addr) + protoAdapter2.encodedSizeWithTag(6, c691702mx2.play_addr_bytevc1) + c691702mx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C691702mx c691702mx) {
            C691702mx c691702mx2 = c691702mx;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c691702mx2.lang);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c691702mx2.language_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c691702mx2.voice_type);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 4, c691702mx2.play_addr);
            protoAdapter2.encodeWithTag(protoWriter, 6, c691702mx2.play_addr_bytevc1);
            protoWriter.writeBytes(c691702mx2.unknownFields());
        }
    };
    public String lang;
    public Long language_id;
    public C673002jw play_addr;
    public C673002jw play_addr_bytevc1;
    public String voice_type;

    public C691702mx() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C691602mw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
