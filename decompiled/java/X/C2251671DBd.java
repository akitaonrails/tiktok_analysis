package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251671DBd extends Message<C2251671DBd, C2251681DBe> {
    public static final ProtoAdapter<C2251671DBd> ADAPTER = new ProtoAdapter<C2251671DBd>() { // from class: X.1DBc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251671DBd decode(ProtoReader protoReader) {
            C2251681DBe c2251681DBe = new C2251681DBe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2251681DBe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2251681DBe.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c2251681DBe.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2251681DBe.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2251681DBe.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251681DBe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251671DBd c2251671DBd) {
            C2251671DBd c2251671DBd2 = c2251671DBd;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c2251671DBd2.play_num_all) + protoAdapter.encodedSizeWithTag(2, c2251671DBd2.batch_num_all) + protoAdapter.encodedSizeWithTag(3, c2251671DBd2.play_num) + protoAdapter.encodedSizeWithTag(4, c2251671DBd2.batch_num) + c2251671DBd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251671DBd c2251671DBd) {
            C2251671DBd c2251671DBd2 = c2251671DBd;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251671DBd2.play_num_all);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251671DBd2.batch_num_all);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251671DBd2.play_num);
            protoAdapter.encodeWithTag(protoWriter, 4, c2251671DBd2.batch_num);
            protoWriter.writeBytes(c2251671DBd2.unknownFields());
        }
    };
    public Integer batch_num;
    public Integer batch_num_all;
    public Integer play_num;
    public Integer play_num_all;

    @Override // com.squareup.wire.Message
    public C2251681DBe newBuilder() {
        return null;
    }

    public C2251671DBd(Integer num, Integer num2, Integer num3, Integer num4) {
        this(num, num2, num3, num4, ByteString.EMPTY);
    }

    public C2251671DBd(Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.play_num_all = num;
        this.batch_num_all = num2;
        this.play_num = num3;
        this.batch_num = num4;
    }
}
