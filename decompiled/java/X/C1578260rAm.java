package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578260rAm extends Message<C1578260rAm, C1578270rAn> {
    public static final ProtoAdapter<C1578260rAm> ADAPTER = new ProtoAdapter<C1578260rAm>() { // from class: X.0rAb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578260rAm decode(ProtoReader protoReader) {
            C1578270rAn c1578270rAn = new C1578270rAn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1578270rAn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1578270rAn.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1578270rAn.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1578270rAn.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1578270rAn.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578270rAn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578260rAm c1578260rAm) {
            C1578260rAm c1578260rAm2 = c1578260rAm;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c1578260rAm2.scene);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1578260rAm2.category_id) + protoAdapter.encodedSizeWithTag(3, c1578260rAm2.name) + protoAdapter.encodedSizeWithTag(4, c1578260rAm2.metric_name) + c1578260rAm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578260rAm c1578260rAm) {
            C1578260rAm c1578260rAm2 = c1578260rAm;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1578260rAm2.scene);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c1578260rAm2.category_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c1578260rAm2.name);
            protoAdapter.encodeWithTag(protoWriter, 4, c1578260rAm2.metric_name);
            protoWriter.writeBytes(c1578260rAm2.unknownFields());
        }
    };
    public String category_id;
    public String metric_name;
    public String name;
    public Integer scene;

    @Override // com.squareup.wire.Message
    public C1578270rAn newBuilder() {
        return null;
    }

    public C1578260rAm(Integer num, String str, String str2, String str3) {
        this(num, str, str2, str3, ByteString.EMPTY);
    }

    public C1578260rAm(Integer num, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scene = num;
        this.category_id = str;
        this.name = str2;
        this.metric_name = str3;
    }
}
