package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGL extends Message<C1CGL, C1CGM> {
    public static final ProtoAdapter<C1CGL> ADAPTER = new ProtoAdapter<C1CGL>() { // from class: X.1CGK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGL decode(ProtoReader protoReader) {
            C1CGL c1cgl = new C1CGL();
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
                                    c1cgl.link = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cgl.link_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cgl.desc = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cgl.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cgl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CGL c1cgl) {
            C1CGL c1cgl2 = c1cgl;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cgl2.title) + protoAdapter.encodedSizeWithTag(2, c1cgl2.desc) + protoAdapter.encodedSizeWithTag(3, c1cgl2.link_text) + protoAdapter.encodedSizeWithTag(4, c1cgl2.link) + c1cgl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CGL c1cgl) {
        }
    };
    public String desc;
    public String link;
    public String link_text;
    public String title;

    public C1CGL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CGM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
