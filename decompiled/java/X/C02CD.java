package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CD extends Message<C02CD, C02IY> {
    public static final ProtoAdapter<C02CD> ADAPTER = new ProtoAdapter<C02CD>() { // from class: X.025F
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CD decode(ProtoReader protoReader) {
            C02CD c02cd = new C02CD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cd.cm_preview_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02cd.generated_preview_duration = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c02cd.generated_preview_start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c02cd.preview_settings_duration = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c02cd.preview_settings_start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c02cd.should_show_preview = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c02cd.is_in_grace_period = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CD c02cd) {
            C02CD c02cd2 = c02cd;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02cd2.cm_preview_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02cd2.generated_preview_duration) + protoAdapter.encodedSizeWithTag(3, c02cd2.generated_preview_start_time) + protoAdapter.encodedSizeWithTag(4, c02cd2.preview_settings_duration) + protoAdapter.encodedSizeWithTag(5, c02cd2.preview_settings_start_time);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(6, c02cd2.should_show_preview) + protoAdapter2.encodedSizeWithTag(7, c02cd2.is_in_grace_period) + c02cd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CD c02cd) {
            C02CD c02cd2 = c02cd;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02cd2.cm_preview_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c02cd2.generated_preview_duration);
            protoAdapter.encodeWithTag(protoWriter, 3, c02cd2.generated_preview_start_time);
            protoAdapter.encodeWithTag(protoWriter, 4, c02cd2.preview_settings_duration);
            protoAdapter.encodeWithTag(protoWriter, 5, c02cd2.preview_settings_start_time);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 6, c02cd2.should_show_preview);
            protoAdapter2.encodeWithTag(protoWriter, 7, c02cd2.is_in_grace_period);
            protoWriter.writeBytes(c02cd2.unknownFields());
        }
    };
    public Integer cm_preview_type;
    public Long generated_preview_duration;
    public Long generated_preview_start_time;
    public Boolean is_in_grace_period;
    public Long preview_settings_duration;
    public Long preview_settings_start_time;
    public Boolean should_show_preview;

    public C02CD() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
