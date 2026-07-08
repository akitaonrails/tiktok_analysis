package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224741C5o extends Message<C2224741C5o, C2224751C5p> {
    public static final ProtoAdapter<C2224741C5o> ADAPTER = new ProtoAdapter<C2224741C5o>() { // from class: X.1C5n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224741C5o decode(ProtoReader protoReader) {
            C2224741C5o c2224741C5o = new C2224741C5o();
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
                                    c2224741C5o.tag_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c2224741C5o.contents = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2224741C5o.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2224741C5o.icon = C029C.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224741C5o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224741C5o c2224741C5o) {
            C2224741C5o c2224741C5o2 = c2224741C5o;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c2224741C5o2.icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2224741C5o2.name) + protoAdapter.encodedSizeWithTag(3, c2224741C5o2.contents) + ProtoAdapter.INT32.encodedSizeWithTag(4, c2224741C5o2.tag_type) + c2224741C5o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224741C5o c2224741C5o) {
        }
    };
    public String contents;
    public C029C icon;
    public String name;
    public Integer tag_type;

    public C2224741C5o() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224751C5p newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
