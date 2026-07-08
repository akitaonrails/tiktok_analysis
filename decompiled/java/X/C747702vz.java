package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C747702vz extends Message<C747702vz, C747802w0> {
    public static final ProtoAdapter<C747702vz> ADAPTER = new ProtoAdapter<C747702vz>() { // from class: X.02vy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C747702vz decode(ProtoReader protoReader) {
            C747702vz c747702vz = new C747702vz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c747702vz.dynamic_cover = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c747702vz.cover = C673002jw.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c747702vz.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c747702vz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C747702vz c747702vz) {
            C747702vz c747702vz2 = c747702vz;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c747702vz2.aweme_id);
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c747702vz2.cover) + protoAdapter.encodedSizeWithTag(3, c747702vz2.dynamic_cover) + c747702vz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C747702vz c747702vz) {
            C747702vz c747702vz2 = c747702vz;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c747702vz2.aweme_id);
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c747702vz2.cover);
            protoAdapter.encodeWithTag(protoWriter, 3, c747702vz2.dynamic_cover);
            protoWriter.writeBytes(c747702vz2.unknownFields());
        }
    };
    public String aweme_id;
    public C673002jw cover;
    public C673002jw dynamic_cover;

    public C747702vz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C747802w0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
