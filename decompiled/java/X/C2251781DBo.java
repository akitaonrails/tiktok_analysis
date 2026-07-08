package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251781DBo extends Message<C2251781DBo, C2251791DBp> {
    public static final ProtoAdapter<C2251781DBo> ADAPTER = new ProtoAdapter<C2251781DBo>() { // from class: X.1DBn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251781DBo decode(ProtoReader protoReader) {
            C2251791DBp c2251791DBp = new C2251791DBp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2251791DBp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2251791DBp.LJII = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c2251791DBp.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2251791DBp.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2251791DBp.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2251791DBp.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251791DBp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251781DBo c2251781DBo) {
            C2251781DBo c2251781DBo2 = c2251781DBo;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c2251781DBo2.version);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2251781DBo2.install_status_bitmap_part1) + protoAdapter.encodedSizeWithTag(3, c2251781DBo2.install_status_bitmap_part2) + protoAdapter.encodedSizeWithTag(4, c2251781DBo2.detect_status_bitmap_part1) + protoAdapter.encodedSizeWithTag(5, c2251781DBo2.detect_status_bitmap_part2) + c2251781DBo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251781DBo c2251781DBo) {
            C2251781DBo c2251781DBo2 = c2251781DBo;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c2251781DBo2.version);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c2251781DBo2.install_status_bitmap_part1);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251781DBo2.install_status_bitmap_part2);
            protoAdapter.encodeWithTag(protoWriter, 4, c2251781DBo2.detect_status_bitmap_part1);
            protoAdapter.encodeWithTag(protoWriter, 5, c2251781DBo2.detect_status_bitmap_part2);
            protoWriter.writeBytes(c2251781DBo2.unknownFields());
        }
    };
    public Long detect_status_bitmap_part1;
    public Long detect_status_bitmap_part2;
    public Long install_status_bitmap_part1;
    public Long install_status_bitmap_part2;
    public Integer version;

    @Override // com.squareup.wire.Message
    public C2251791DBp newBuilder() {
        return null;
    }

    public C2251781DBo(Integer num, Long l, Long l2, Long l3, Long l4) {
        this(num, l, l2, l3, l4, ByteString.EMPTY);
    }

    public C2251781DBo(Integer num, Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = num;
        this.install_status_bitmap_part1 = l;
        this.install_status_bitmap_part2 = l2;
        this.detect_status_bitmap_part1 = l3;
        this.detect_status_bitmap_part2 = l4;
    }
}
