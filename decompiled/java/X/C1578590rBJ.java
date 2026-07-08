package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rBJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578590rBJ extends Message<C1578590rBJ, C1578580rBI> {
    public static final ProtoAdapter<C1578590rBJ> ADAPTER = new ProtoAdapter<C1578590rBJ>() { // from class: X.0rBK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578590rBJ decode(ProtoReader protoReader) {
            C1578590rBJ c1578590rBJ = new C1578590rBJ();
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
                                        c1578590rBJ.is_last_watched = ProtoAdapter.BOOL.decode(protoReader);
                                    }
                                } else {
                                    c1578590rBJ.video_id = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1578590rBJ.is_unlocked = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1578590rBJ.seq_id = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1578590rBJ.num_watched = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578590rBJ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578590rBJ c1578590rBJ) {
            C1578590rBJ c1578590rBJ2 = c1578590rBJ;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1578590rBJ2.num_watched) + protoAdapter.encodedSizeWithTag(2, c1578590rBJ2.seq_id);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1578590rBJ2.is_unlocked) + ProtoAdapter.INT64.encodedSizeWithTag(4, c1578590rBJ2.video_id) + protoAdapter2.encodedSizeWithTag(5, c1578590rBJ2.is_last_watched) + c1578590rBJ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578590rBJ c1578590rBJ) {
            C1578590rBJ c1578590rBJ2 = c1578590rBJ;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1578590rBJ2.num_watched);
            protoAdapter.encodeWithTag(protoWriter, 2, c1578590rBJ2.seq_id);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 3, c1578590rBJ2.is_unlocked);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c1578590rBJ2.video_id);
            protoAdapter2.encodeWithTag(protoWriter, 5, c1578590rBJ2.is_last_watched);
            protoWriter.writeBytes(c1578590rBJ2.unknownFields());
        }
    };
    public Boolean is_last_watched;
    public Boolean is_unlocked;
    public Integer num_watched;
    public Integer seq_id;
    public Long video_id;

    public C1578590rBJ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1578580rBI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
