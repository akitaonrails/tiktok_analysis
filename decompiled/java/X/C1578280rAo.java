package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578280rAo extends Message<C1578280rAo, C1578300rAq> {
    public static final ProtoAdapter<C1578280rAo> ADAPTER = new ProtoAdapter<C1578280rAo>() { // from class: X.0rAc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578280rAo decode(ProtoReader protoReader) {
            C1578300rAq c1578300rAq = new C1578300rAq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1578300rAq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1578300rAq.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1578300rAq.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578300rAq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578280rAo c1578280rAo) {
            C1578280rAo c1578280rAo2 = c1578280rAo;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1578280rAo2.scene_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1578280rAo2.title) + c1578280rAo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578280rAo c1578280rAo) {
            C1578280rAo c1578280rAo2 = c1578280rAo;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1578280rAo2.scene_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1578280rAo2.title);
            protoWriter.writeBytes(c1578280rAo2.unknownFields());
        }
    };
    public Integer scene_id;
    public String title;

    @Override // com.squareup.wire.Message
    public C1578300rAq newBuilder() {
        return null;
    }

    public C1578280rAo(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public C1578280rAo(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene_id = num;
        this.title = str;
    }
}
