package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C546602Bc extends Message<C546602Bc, C573602Lm> {
    public static final ProtoAdapter<C546602Bc> ADAPTER = new ProtoAdapter<C546602Bc>() { // from class: X.023m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C546602Bc decode(ProtoReader protoReader) {
            C546602Bc c546602Bc = new C546602Bc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c546602Bc.index = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c546602Bc.start_time_in_ms = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c546602Bc.end_time_in_ms = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c546602Bc.music_info = C5199020v.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c546602Bc.play_start_time_in_ms = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c546602Bc.is_main_song = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c546602Bc.volume = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c546602Bc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C546602Bc c546602Bc) {
            C546602Bc c546602Bc2 = c546602Bc;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c546602Bc2.index) + protoAdapter.encodedSizeWithTag(2, c546602Bc2.start_time_in_ms) + protoAdapter.encodedSizeWithTag(3, c546602Bc2.end_time_in_ms) + C5199020v.ADAPTER.encodedSizeWithTag(4, c546602Bc2.music_info) + protoAdapter.encodedSizeWithTag(5, c546602Bc2.play_start_time_in_ms) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c546602Bc2.is_main_song) + ProtoAdapter.DOUBLE.encodedSizeWithTag(7, c546602Bc2.volume) + c546602Bc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C546602Bc c546602Bc) {
            C546602Bc c546602Bc2 = c546602Bc;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c546602Bc2.index);
            protoAdapter.encodeWithTag(protoWriter, 2, c546602Bc2.start_time_in_ms);
            protoAdapter.encodeWithTag(protoWriter, 3, c546602Bc2.end_time_in_ms);
            C5199020v.ADAPTER.encodeWithTag(protoWriter, 4, c546602Bc2.music_info);
            protoAdapter.encodeWithTag(protoWriter, 5, c546602Bc2.play_start_time_in_ms);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c546602Bc2.is_main_song);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 7, c546602Bc2.volume);
            protoWriter.writeBytes(c546602Bc2.unknownFields());
        }
    };
    public Integer end_time_in_ms;
    public Integer index;
    public Boolean is_main_song;
    public C5199020v music_info;
    public Integer play_start_time_in_ms;
    public Integer start_time_in_ms;
    public Double volume;

    public C546602Bc() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C573602Lm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
