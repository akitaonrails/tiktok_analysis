package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C605602Xu extends Message<C605602Xu, C605702Xv> {
    public static final ProtoAdapter<C605602Xu> ADAPTER = new ProtoAdapter<C605602Xu>() { // from class: X.02Xt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C605602Xu decode(ProtoReader protoReader) {
            C605602Xu c605602Xu = new C605602Xu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c605602Xu.disable_change_poi = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c605602Xu.alliance_item_label_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c605602Xu.alliance_item_label_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c605602Xu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C605602Xu c605602Xu) {
            C605602Xu c605602Xu2 = c605602Xu;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c605602Xu2.alliance_item_label_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c605602Xu2.alliance_item_label_text) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c605602Xu2.disable_change_poi) + c605602Xu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C605602Xu c605602Xu) {
            C605602Xu c605602Xu2 = c605602Xu;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c605602Xu2.alliance_item_label_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c605602Xu2.alliance_item_label_text);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c605602Xu2.disable_change_poi);
            protoWriter.writeBytes(c605602Xu2.unknownFields());
        }
    };
    public String alliance_item_label_text;
    public Integer alliance_item_label_type;
    public Boolean disable_change_poi;

    public C605602Xu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C605702Xv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
