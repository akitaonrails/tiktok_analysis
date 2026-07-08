package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Az, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C546302Az extends Message<C546302Az, C02L0> {
    public static final ProtoAdapter<C546302Az> ADAPTER = new ProtoAdapter<C546302Az>() { // from class: X.0249
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C546302Az decode(ProtoReader protoReader) {
            C546302Az c546302Az = new C546302Az();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c546302Az.full_clip_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c546302Az.full_clip_author = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c546302Az.full_clip_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c546302Az.collect_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c546302Az.default_performer_avatar = C02EQ.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c546302Az.mv_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c546302Az.is_show_entrance = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c546302Az;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C546302Az c546302Az) {
            C546302Az c546302Az2 = c546302Az;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c546302Az2.full_clip_id) + protoAdapter.encodedSizeWithTag(2, c546302Az2.full_clip_author) + protoAdapter.encodedSizeWithTag(3, c546302Az2.full_clip_title) + ProtoAdapter.INT32.encodedSizeWithTag(4, c546302Az2.collect_status) + C02EQ.ADAPTER.encodedSizeWithTag(5, c546302Az2.default_performer_avatar) + ProtoAdapter.INT64.encodedSizeWithTag(6, c546302Az2.mv_id) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c546302Az2.is_show_entrance) + c546302Az2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C546302Az c546302Az) {
            C546302Az c546302Az2 = c546302Az;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c546302Az2.full_clip_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c546302Az2.full_clip_author);
            protoAdapter.encodeWithTag(protoWriter, 3, c546302Az2.full_clip_title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c546302Az2.collect_status);
            C02EQ.ADAPTER.encodeWithTag(protoWriter, 5, c546302Az2.default_performer_avatar);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, c546302Az2.mv_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, c546302Az2.is_show_entrance);
            protoWriter.writeBytes(c546302Az2.unknownFields());
        }
    };
    public Integer collect_status;
    public C02EQ default_performer_avatar;
    public String full_clip_author;
    public String full_clip_id;
    public String full_clip_title;
    public Boolean is_show_entrance;
    public Long mv_id;

    public C546302Az() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02L0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
