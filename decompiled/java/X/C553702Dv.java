package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C553702Dv extends Message<C553702Dv, C02IJ> {
    public static final ProtoAdapter<C553702Dv> ADAPTER = new ProtoAdapter<C553702Dv>() { // from class: X.025p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C553702Dv decode(ProtoReader protoReader) {
            C553702Dv c553702Dv = new C553702Dv();
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
                                        c553702Dv.interactive_rec_tag_type = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c553702Dv.prompt_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c553702Dv.effective_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c553702Dv.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c553702Dv.id = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c553702Dv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C553702Dv c553702Dv) {
            C553702Dv c553702Dv2 = c553702Dv;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c553702Dv2.id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c553702Dv2.name) + protoAdapter2.encodedSizeWithTag(3, c553702Dv2.effective_name) + protoAdapter.encodedSizeWithTag(4, c553702Dv2.prompt_type) + ProtoAdapter.INT64.encodedSizeWithTag(5, c553702Dv2.interactive_rec_tag_type) + c553702Dv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C553702Dv c553702Dv) {
            C553702Dv c553702Dv2 = c553702Dv;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c553702Dv2.id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c553702Dv2.name);
            protoAdapter2.encodeWithTag(protoWriter, 3, c553702Dv2.effective_name);
            protoAdapter.encodeWithTag(protoWriter, 4, c553702Dv2.prompt_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c553702Dv2.interactive_rec_tag_type);
            protoWriter.writeBytes(c553702Dv2.unknownFields());
        }
    };
    public String effective_name;
    public Integer id;
    public Long interactive_rec_tag_type;
    public String name;
    public Integer prompt_type;

    public C553702Dv() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
