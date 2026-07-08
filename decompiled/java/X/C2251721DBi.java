package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251721DBi extends Message<C2251721DBi, C2251731DBj> {
    public static final ProtoAdapter<C2251721DBi> ADAPTER = new ProtoAdapter<C2251721DBi>() { // from class: X.1DBh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251721DBi decode(ProtoReader protoReader) {
            C2251731DBj c2251731DBj = new C2251731DBj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2251731DBj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2251731DBj.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c2251731DBj.LJFF = C2251751DBl.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2251731DBj.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2251731DBj.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251731DBj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251721DBi c2251721DBi) {
            C2251721DBi c2251721DBi2 = c2251721DBi;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c2251721DBi2.new_user_with_video_file) + protoAdapter.encodedSizeWithTag(2, c2251721DBi2.old_user_with_video_file) + C2251751DBl.ADAPTER.encodedSizeWithTag(3, c2251721DBi2.onboarding_feed_params) + protoAdapter.encodedSizeWithTag(4, c2251721DBi2.mock_hybridab_id) + c2251721DBi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251721DBi c2251721DBi) {
            C2251721DBi c2251721DBi2 = c2251721DBi;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251721DBi2.new_user_with_video_file);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251721DBi2.old_user_with_video_file);
            C2251751DBl.ADAPTER.encodeWithTag(protoWriter, 3, c2251721DBi2.onboarding_feed_params);
            protoAdapter.encodeWithTag(protoWriter, 4, c2251721DBi2.mock_hybridab_id);
            protoWriter.writeBytes(c2251721DBi2.unknownFields());
        }
    };
    public Integer mock_hybridab_id;
    public Integer new_user_with_video_file;
    public Integer old_user_with_video_file;
    public C2251751DBl onboarding_feed_params;

    @Override // com.squareup.wire.Message
    public C2251731DBj newBuilder() {
        return null;
    }

    public C2251721DBi(Integer num, Integer num2, C2251751DBl c2251751DBl, Integer num3) {
        this(num, num2, c2251751DBl, num3, ByteString.EMPTY);
    }

    public C2251721DBi(Integer num, Integer num2, C2251751DBl c2251751DBl, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.new_user_with_video_file = num;
        this.old_user_with_video_file = num2;
        this.onboarding_feed_params = c2251751DBl;
        this.mock_hybridab_id = num3;
    }
}
