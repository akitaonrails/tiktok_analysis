package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C671402jg extends Message<C671402jg, C671502jh> {
    public static final ProtoAdapter<C671402jg> ADAPTER = new ProtoAdapter<C671402jg>() { // from class: X.02jf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C671402jg decode(ProtoReader protoReader) {
            C671402jg c671402jg = new C671402jg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c671402jg.url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c671402jg.lang = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c671402jg.keyword = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c671402jg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C671402jg c671402jg) {
            C671402jg c671402jg2 = c671402jg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c671402jg2.keyword) + protoAdapter.encodedSizeWithTag(2, c671402jg2.lang) + protoAdapter.encodedSizeWithTag(3, c671402jg2.url) + c671402jg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C671402jg c671402jg) {
            C671402jg c671402jg2 = c671402jg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c671402jg2.keyword);
            protoAdapter.encodeWithTag(protoWriter, 2, c671402jg2.lang);
            protoAdapter.encodeWithTag(protoWriter, 3, c671402jg2.url);
            protoWriter.writeBytes(c671402jg2.unknownFields());
        }
    };
    public String keyword;
    public String lang;
    public String url;

    public C671402jg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C671502jh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
