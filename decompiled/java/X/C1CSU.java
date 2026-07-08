package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSU extends Message<C1CSU, C1CST> {
    public static final ProtoAdapter<C1CSU> ADAPTER = new ProtoAdapter<C1CSU>() { // from class: X.1CSS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSU decode(ProtoReader protoReader) {
            C1CST c1cst = new C1CST();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 7) {
                                        if (iNextTag != 8) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c1cst.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c1cst.LJIIIIZZ = C2223151Bzl.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c1cst.LJII = C1517970pbX.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1cst.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cst.LJFF = C2226941CEa.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1cst.LJ = C2226941CEa.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cst.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cst.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CSU c1csu) {
            C1CSU c1csu2 = c1csu;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c1csu2.status_code);
            ProtoAdapter<C2226941CEa> protoAdapter = C2226941CEa.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1csu2.forward_list) + protoAdapter.encodedSizeWithTag(3, c1csu2.reverse_list) + ProtoAdapter.STRING.encodedSizeWithTag(4, c1csu2.user_status) + C1517970pbX.ADAPTER.encodedSizeWithTag(7, c1csu2.extra) + C2223151Bzl.ADAPTER.encodedSizeWithTag(8, c1csu2.log_pb) + c1csu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CSU c1csu) {
            C1CSU c1csu2 = c1csu;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1csu2.status_code);
            ProtoAdapter<C2226941CEa> protoAdapter = C2226941CEa.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, c1csu2.forward_list);
            protoAdapter.encodeWithTag(protoWriter, 3, c1csu2.reverse_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c1csu2.user_status);
            C1517970pbX.ADAPTER.encodeWithTag(protoWriter, 7, c1csu2.extra);
            C2223151Bzl.ADAPTER.encodeWithTag(protoWriter, 8, c1csu2.log_pb);
            protoWriter.writeBytes(c1csu2.unknownFields());
        }
    };
    public C1517970pbX extra;
    public C2226941CEa forward_list;
    public C2223151Bzl log_pb;
    public C2226941CEa reverse_list;
    public Integer status_code;
    public String user_status;

    @Override // com.squareup.wire.Message
    public C1CST newBuilder() {
        return null;
    }

    public C1CSU(Integer num, C2226941CEa c2226941CEa, C2226941CEa c2226941CEa2, String str, C1517970pbX c1517970pbX, C2223151Bzl c2223151Bzl) {
        this(num, c2226941CEa, c2226941CEa2, str, c1517970pbX, c2223151Bzl, ByteString.EMPTY);
    }

    public C1CSU(Integer num, C2226941CEa c2226941CEa, C2226941CEa c2226941CEa2, String str, C1517970pbX c1517970pbX, C2223151Bzl c2223151Bzl, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_code = num;
        this.forward_list = c2226941CEa;
        this.reverse_list = c2226941CEa2;
        this.user_status = str;
        this.extra = c1517970pbX;
        this.log_pb = c2223151Bzl;
    }
}
