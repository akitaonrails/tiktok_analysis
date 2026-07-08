package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C546802Be extends Message<C546802Be, C02M0> {
    public static final ProtoAdapter<C546802Be> ADAPTER = new ProtoAdapter<C546802Be>() { // from class: X.027O
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C546802Be decode(ProtoReader protoReader) {
            C546802Be c546802Be = new C546802Be();
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
                                    c546802Be.keyword = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c546802Be.gradient_colors.add(ProtoAdapter.INT32.decode(protoReader));
                            }
                        } else {
                            c546802Be.end = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c546802Be.start = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c546802Be;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C546802Be c546802Be) {
            C546802Be c546802Be2 = c546802Be;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c546802Be2.start) + protoAdapter.encodedSizeWithTag(2, c546802Be2.end) + protoAdapter.asRepeated().encodedSizeWithTag(3, c546802Be2.gradient_colors) + ProtoAdapter.STRING.encodedSizeWithTag(4, c546802Be2.keyword) + c546802Be2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C546802Be c546802Be) {
            C546802Be c546802Be2 = c546802Be;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c546802Be2.start);
            protoAdapter.encodeWithTag(protoWriter, 2, c546802Be2.end);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c546802Be2.gradient_colors);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c546802Be2.keyword);
            protoWriter.writeBytes(c546802Be2.unknownFields());
        }
    };
    public Integer end;
    public List<Integer> gradient_colors;
    public String keyword;
    public Integer start;

    public C546802Be() {
        super(ADAPTER, ByteString.EMPTY);
        this.gradient_colors = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02M0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
